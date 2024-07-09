package Banky;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class TransferMoney extends JFrame implements ActionListener {
    JTextField tAccountNo1, tAmount, tAccountNo2;
    JButton withdraw, clear;
    TransferMoney(){
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        JLabel heading = new JLabel("TRANSFER MONEY");
        heading.setBounds(30,20,500,50);
        heading.setForeground(Color.black);
        heading.setFont(new Font("Times New Roman",Font.ITALIC,40));
        add(heading);

        JLabel accountNo1 = new JLabel("Our Account No");
        accountNo1.setBounds(30,100,500,50);
        accountNo1.setForeground(Color.black);
        accountNo1.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(accountNo1);

        tAccountNo1 = new JTextField();
        tAccountNo1.setBounds(20,150,350,40);
        tAccountNo1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAccountNo1);

        JLabel accountNo = new JLabel("Other Account No");
        accountNo.setBounds(30,200,500,50);
        accountNo.setForeground(Color.black);
        accountNo.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(accountNo);

        tAccountNo2 = new JTextField();
        tAccountNo2.setBounds(20,250,350,40);
        tAccountNo2.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAccountNo2);

        JLabel amount = new JLabel("Amount");
        amount.setBounds(30,300,500,50);
        amount.setForeground(Color.black);
        amount.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(amount);

        tAmount = new JTextField();
        tAmount.setBounds(20,350,350,40);
        tAmount.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAmount);

        withdraw = new JButton("TRANSFER");
        withdraw.setBounds(60,440,250,40);
        withdraw.setFont(new Font("Times New Roman",Font.BOLD,28));
        withdraw.setBackground(Color.orange);
        withdraw.setForeground(Color.black);
        withdraw.addActionListener(this);
        add(withdraw);

        clear = new JButton("CLEAR");
        clear.setBounds(60,500,250,40);
        clear.setFont(new Font("Times New Roman",Font.BOLD,28));
        clear.setBackground(Color.orange);
        clear.setForeground(Color.black);
        clear.addActionListener(this);
        add(clear);


        setSize(400, 600);
        setLocation(570, 120);
        setVisible(true);
        setTitle("Transfer Amount");
    }
    public static void main(String[] args) {
        new TransferMoney();
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
            int account1 = Integer.parseInt(tAccountNo1.getText());
            int account2 = Integer.parseInt(tAccountNo2.getText());
            int amount = Integer.parseInt(tAmount.getText());

            int currentAmount1 = q.getAmount(conn, account1);
            int currentAmount2 = q.getAmount(conn, account2);

            if (amount <= currentAmount1) {
                int a = amount;
                a = currentAmount1 - amount;
                q.updateAmount(conn, a, account1);
                a = amount;
                a = currentAmount2 + amount;
                q.updateAmount(conn, a, account2);
                setVisible(false);
                new PopMessage("Amount transfer successful.");
            } else {
                new PopMessage("Amount not transfer successful.");
            }


        }
    }
}
