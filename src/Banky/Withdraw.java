package Banky;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Withdraw extends JFrame implements ActionListener {
    JTextField tAccountNo, tAmount;
    JButton withdraw, clear;
    Withdraw(){
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        JLabel heading = new JLabel("WITHDRAW MONEY");
        heading.setBounds(30,20,500,50);
        heading.setForeground(Color.black);
        heading.setFont(new Font("Times New Roman",Font.ITALIC,40));
        add(heading);

        JLabel accountNo = new JLabel("Account No");
        accountNo.setBounds(30,100,500,50);
        accountNo.setForeground(Color.black);
        accountNo.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(accountNo);

        tAccountNo = new JTextField();
        tAccountNo.setBounds(20,150,350,40);
        tAccountNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAccountNo);

        JLabel amount = new JLabel("Amount");
        amount.setBounds(30,210,500,50);
        amount.setForeground(Color.black);
        amount.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(amount);

        tAmount = new JTextField();
        tAmount.setBounds(20,260,350,40);
        tAmount.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAmount);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(60,360,250,40);
        withdraw.setFont(new Font("Times New Roman",Font.BOLD,28));
        withdraw.setBackground(Color.orange);
        withdraw.setForeground(Color.black);
        withdraw.addActionListener(this);
        add(withdraw);

        clear = new JButton("CLEAR");
        clear.setBounds(60,440,250,40);
        clear.setFont(new Font("Times New Roman",Font.BOLD,28));
        clear.setBackground(Color.orange);
        clear.setForeground(Color.black);
        clear.addActionListener(this);
        add(clear);


        setSize(400, 600);
        setLocation(570, 120);
        setVisible(true);
        setTitle("Withdraw Amount");
    }
    public static void main(String[] args) {
        new Withdraw();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            setVisible(false);
            new Withdraw();
        } else if (e.getSource() == withdraw) {
            Query q = new Query();
            ClassConnection cl = new ClassConnection();
            Connection conn = cl.connection();
            int account = Integer.parseInt(tAccountNo.getText());
            int amount = Integer.parseInt(tAmount.getText());
            int currentAmount = q.getAmount(conn, account);
            if (amount <= currentAmount) {
                amount = currentAmount - amount;
                q.updateAmount(conn, amount, account);
                setVisible(false);
                new PopMessage("Transaction successful.");
            } else {
                new PopMessage("Account balanced less than amount.");
            }
        }
    }
}
