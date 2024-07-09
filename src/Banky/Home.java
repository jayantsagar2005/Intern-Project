package Banky;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Home extends JFrame implements ActionListener {

    JButton openAccount, depositMoney, withdrawMoney, transferMoney, updateInformation, deleteAccount;

    Home() {

        getContentPane().setBackground(Color.magenta);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/home1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 120, 1000, 700);
        add(image);

        LocalDate now = LocalDate.now();
        String date1 = now.toString();
        JLabel date = new JLabel("Date: " + date1);
        date.setFont(new Font("Impact", Font.BOLD, 25));
        date.setBounds(20, 15, 200, 30);
        add(date);


        JLabel welcome = new JLabel(" ~ Welcome ~ ");
        welcome.setBounds(520, 20, 1000, 75);
        welcome.setForeground(Color.BLUE);
        welcome.setFont(new Font("Times New Roman", Font.BOLD, 90));
        add(welcome);

        JLabel heading = new JLabel("Happy Bank System");
        heading.setBounds(490, 120, 1000, 75);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 70));
        add(heading);

        JTextField temp = new JTextField();
        add(temp);


        openAccount = new JButton();
        openAccount.setText("OPEN ACCOUNT");
        openAccount.setBounds(1000, 250, 370, 50);
        openAccount.setFont(new Font("Times New Roman", Font.BOLD, 28));
        openAccount.setBackground(Color.lightGray);
        openAccount.setForeground(Color.black);
        openAccount.addActionListener(this);
        add(openAccount);

        depositMoney = new JButton();
        depositMoney.setText("DEPOSIT MONEY");
        depositMoney.setBounds(1000, 335, 370, 50);
        depositMoney.setFont(new Font("Times New Roman", Font.BOLD, 28));
        depositMoney.setBackground(Color.lightGray);
        depositMoney.setForeground(Color.black);
        depositMoney.addActionListener(this);
        add(depositMoney);

        withdrawMoney = new JButton();
        withdrawMoney.setText("WITHDRAW MONEY");
        withdrawMoney.setBounds(1000, 420, 370, 50);
        withdrawMoney.setFont(new Font("Times New Roman", Font.BOLD, 28));
        withdrawMoney.setBackground(Color.lightGray);
        withdrawMoney.setForeground(Color.black);
        withdrawMoney.addActionListener(this);
        add(withdrawMoney);

        transferMoney = new JButton();
        transferMoney.setText("TRANSFER BALANCE");
        transferMoney.setBounds(1000, 505, 370, 50);
        transferMoney.setFont(new Font("Times New Roman", Font.BOLD, 28));
        transferMoney.setBackground(Color.lightGray);
        transferMoney.setForeground(Color.black);
        transferMoney.addActionListener(this);
        add(transferMoney);

        updateInformation = new JButton();
        updateInformation.setText("ACCOUNT BALANCE");
        updateInformation.setBounds(1000, 590, 370, 50);
        updateInformation.setFont(new Font("Times New Roman", Font.BOLD, 28));
        updateInformation.setBackground(Color.lightGray);
        updateInformation.setForeground(Color.black);
        updateInformation.addActionListener(this);
        add(updateInformation);

        deleteAccount = new JButton();
        deleteAccount.setText("DELETE ACCOUNT");
        deleteAccount.setBounds(1000, 675, 370, 50);
        deleteAccount.setFont(new Font("Times New Roman", Font.BOLD, 28));
        deleteAccount.setBackground(Color.lightGray);
        deleteAccount.setForeground(Color.black);
        deleteAccount.addActionListener(this);
        add(deleteAccount);

        setSize(1600, 900);
        setLocation(-5, 0);
        setVisible(true);
        setTitle("Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openAccount) {
            setVisible(false);
            new OpenAccount();
        } else if (e.getSource() == depositMoney) {
            new DepositAmount();
        } else if (e.getSource() == withdrawMoney) {
            new Withdraw();
        } else if (e.getSource() == transferMoney) {
            new TransferMoney();
        } else if (e.getSource() == updateInformation) {
            new CheckBalance();
        } else if (e.getSource() == deleteAccount) {
            new DeleteAccount();
        }
    }
    public static void main(String[] args) {
        new Home();
    }
}
