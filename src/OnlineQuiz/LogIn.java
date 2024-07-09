package OnlineQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame implements ActionListener {
    JButton rules,exit;
    JTextField tfname;
    LogIn(){

        // frame background color
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        // image properties
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,550,480);
        add(image);

        // label (main heading) properties
        JLabel heading = new JLabel("'Happy Quiz'");
        heading.setBounds(580,40,200,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Impact",Font.ITALIC,35));
        add(heading);

        // label (Name heading) properties
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(555,130,250,40);
        name.setFont(new Font("",Font.BOLD,27));
        name.setForeground(Color.black);
        add(name);

            // text field properties (name input area)
        tfname = new JTextField();
        tfname.setBounds(555,175,225,35);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        tfname.setForeground(Color.gray);
        add(tfname);

        // rules button properties
        rules = new JButton("Rules & Start");
        rules.setBounds(575,230,180,40);
        rules.setFont(new Font("Times New Roman",Font.BOLD,20));
        rules.setBackground(Color.black);
        rules.setForeground(Color.green);
        rules.addActionListener(this);
        add(rules);

            // exits button properties
        exit = new JButton("Exit Quiz");
        exit.setBounds(575,280,180,40);
        exit.setFont(new Font("Times New Roman",Font.BOLD,20));
        exit.setBackground(Color.black);
        exit.setForeground(Color.red);
        exit.addActionListener(this);
        add(exit);

        // main frame properties
        setSize(800,500);
        setLocation(330,180);
        setVisible(true);
        setTitle("Happy Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new LogIn();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == exit) {
            setVisible(false);
//            new closeQuiz();

        }
    }
}
