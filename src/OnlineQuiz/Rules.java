package OnlineQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){

        this.name = name;

        // frame background color
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        // label (heading) properties
        JLabel heading = new JLabel("\"Welcome '"+name+"' Happy Quiz! \"");
        heading.setBounds(40,10,750,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Impact",Font.ITALIC,40));
        add(heading);

        // label (text) properties
        JLabel text = new JLabel();
        text.setBounds(10,30,750,400);
        text.setFont(new Font("Times New Roman",Font.BOLD,17));
        // rules text
        text.setText(
                "<html>"+
                        "1. Total 100 marks of this questions series."+"<br" +
                        "><br>"+
                        "2. Total 10 questions of this questions series."+"<br><br>"+
                        "3. Every correct 1 question is 10 marks."+"<br><br>"+
                        "4. Total timing of every question attempts is 30 second."+"<br><br>"+
                        "5. Life-Line button use after to two option is disabled."+"<br" +
                        "><br>"+
                        "6. Life-Line button used only one time."+"<br><br>"+
                        "7. Basic Java and basic computer questions."+"<br><br>"+
                        "8. Let's Go... Click Start Button.."+"<br><br>"+
                        "</html>"
        );
        add(text);

        // extra text filed
        JTextField temp = new JTextField();
        add(temp);

        // start button properties
        start = new JButton("Start Quiz");
        start.setBounds(450,400,150,40);
        start.setFont(new Font("Times New Roman",Font.BOLD,20));
        start.setBackground(Color.black);
        start.setForeground(Color.green);
        start.addActionListener(this);
        add(start);

        // back button properties
        back = new JButton("Back");
        back.setBounds(170,400,150,40);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.setBackground(Color.black);
        back.setForeground(Color.red);
        back.addActionListener(this);
        add(back);

        // main frame properties
        setSize(800,500);
        setLocation(330,180);
        setVisible(true);
        setTitle("Happy Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start){
            setVisible(false);
            new Quiz(name);

        } else if (ae.getSource() == back) {
            setVisible(false);
            new LogIn();
        }
    }
}
