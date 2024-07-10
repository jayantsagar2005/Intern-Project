package Banky;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PopMessage extends JFrame implements ActionListener {

    JButton ok;
    PopMessage(String s){
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);

        JLabel msg = new JLabel(s);
        msg.setBounds(10,10,500,50);
        msg.setForeground(Color.lightGray);
        msg.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(msg);



        ok = new JButton("OK");
        ok.setBounds(285,95,70,30);
        ok.setFont(new Font("Times New Roman",Font.BOLD,20));
        ok.setBackground(Color.white);
        ok.setForeground(Color.black);
        ok.addActionListener(this);
        add(ok);


        setSize(400, 170);
        setLocation(600, 0);
        setVisible(true);
//        setDefaultCloseOperation(EX);
    }
    public static void main(String[] args) {
        new PopMessage("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok){
            setVisible(false);
        }
    }
}
