package Banky;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompleteOpenAccount extends JFrame implements ActionListener {

    JButton ok;
    CompleteOpenAccount(String accountType1, String fullName, String customerId, String accountNo, int accountBalance){
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);

        JLabel accountType = new JLabel("Account Type : "+accountType1);
        accountType.setBounds(10,10,500,50);
        accountType.setForeground(Color.lightGray);
        accountType.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(accountType);

        JLabel name = new JLabel("Customer Name : "+fullName);
        name.setBounds(10,40,500,50);
        name.setForeground(Color.lightGray);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(name);

        JLabel id = new JLabel("Customer ID : "+customerId);
        id.setBounds(10,70,500,50);
        id.setForeground(Color.lightGray);
        id.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(id);

        JLabel acNo = new JLabel("Account No : "+accountNo);
        acNo.setBounds(10,100,500,50);
        acNo.setForeground(Color.red);
        acNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(acNo);

        JLabel balance = new JLabel("Account Balance : "+accountBalance);
        balance.setBounds(10,130,500,50);
        balance.setForeground(Color.lightGray);
        balance.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(balance);

        JLabel thank = new JLabel("THANK YOU.");
        thank.setBounds(30,190,500,50);
        thank.setForeground(Color.PINK);
        thank.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(thank);

        ok = new JButton("OK");
        ok.setBounds(370,220,70,30);
        ok.setFont(new Font("Times New Roman",Font.BOLD,20));
        ok.setBackground(Color.white);
        ok.setForeground(Color.black);
        ok.addActionListener(this);
        add(ok);


        setSize(500, 300);
        setLocation(520, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CompleteOpenAccount("Saving Account", "Mr Jayant Kumar", "HBS20050721", "7733001", 10);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok){
            setVisible(false);
        }
    }
}
