package OnlineQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Score extends JFrame implements ActionListener {
    private static final String url = "jdbc:mysql://localhost:3306/project";
    private static final String name = "root";
    private static final String password = "Jayant@2005";
    // username, score global declared
    String username;
    int score;
    JButton again,exit;
    String[][] ques;
    String[][] ans;
    String[][] userAns;
    int[] randomNumberArray;

    Score(int score, String username, String[][] ques, String[][] ans, String[][] userAns, int[] randomQuestion){
        this.ques = ques;
        this.ans = ans;
        this.userAns = userAns;
        this.randomNumberArray = randomQuestion;

        this.score = score;
        this.username = username;



        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

//        image properties
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/the.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,440,225);
        add(image);

        // label (score) properties
        JLabel scores = new JLabel();
        scores.setBounds(500,50,300,45);
        scores.setText("Your Score is : "+score);
        scores.setFont(new Font("Times New Roman",Font.BOLD,30));
        scores.setBackground(Color.black);
        scores.setForeground(Color.black);
        add(scores);

        // label (title1) properties
        JLabel title1 = new JLabel();
        title1.setBounds(150,250,700,45);
        title1.setFont(new Font("Times New Roman",Font.BOLD,30));
        title1.setBackground(Color.black);
        title1.setForeground(Color.MAGENTA);
        add(title1);

        // score performance according to score
        if (score>=80){
            title1.setText("\"EXCELLENT PERSON!\"");
        } else if (score>=50) {
            title1.setText("\"GOOD PERSON!\"");
        }else if (score>=20){
            title1.setText("\"AVERAGE PERSON!");
        }else {
            title1.setText("\"BETTER LUCK NEXT TIME!\"");
        }

        // label (title) properties
        JLabel title = new JLabel();
        title.setBounds(50,320,700,45);
        title.setText("Thank You '"+username+"' for Playing Happy Quiz!!");
        title.setFont(new Font("Times New Roman",Font.BOLD,30));
        title.setBackground(Color.black);
        title.setForeground(Color.black);
        add(title);

        JTextField temp = new JTextField();
        add(temp);

        // again button properties
        again = new JButton("Try Again");
        again.setBounds(500,120,230,45);
        again.setFont(new Font("Times New Roman",Font.BOLD,30));
        again.setBackground(Color.black);
        again.setForeground(Color.green);
        again.addActionListener(this);
        add(again);

        // exit button properties
        exit = new JButton("Check Solution");
        exit.setBounds(500,180,230,45);
        exit.setFont(new Font("Times New Roman",Font.BOLD,25));
        exit.setBackground(Color.black);
        exit.setForeground(Color.red);
        exit.addActionListener(this);
        add(exit);

        // data save to databases due to condition
        if(username.equals("User") && score == 0){

            JLabel exception = new JLabel();
            exception.setBounds(150,370,700,45);
            exception.setText("Thank You For Check Code!");
            exception.setFont(new Font("Times New Roman",Font.BOLD,30));
            exception.setBackground(Color.black);
            exception.setForeground(Color.red);
            add(exception);

        }else {
            // sql class connection
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch (ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
            // jdbc driver connection
            try {
                Connection connection = DriverManager.getConnection(url,name,password);

                String query = "insert into scores(Name, Score) values (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1,username);
                preparedStatement.setInt(2,score);

                preparedStatement.executeUpdate();

                preparedStatement.close();
                connection.close();

            }catch (SQLException e){
                JLabel exception = new JLabel();
                exception.setBounds(120,370,700,45);
                exception.setText("Exception : "+e.getMessage());
                exception.setFont(new Font("Times New Roman",Font.BOLD,30));
                exception.setBackground(Color.black);
                exception.setForeground(Color.red);
                add(exception);
            }

        }

        // main frame properties
        setSize(800,500);
        setLocation(330,180);
        setVisible(true);
        setTitle("Happy Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws Exception {
        String[][] ques = new String[10][5];
        String[][] ans = new String[10][2];
        String[][] userAns = new String[10][1];
        int[] randomNumberArray = new int[10];

        new Score(0,"User",ques,ans,userAns,randomNumberArray);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == again){
            setVisible(false);
            new LogIn();
        }else{
            setVisible(false);
            new Solution(ques, ans, userAns, randomNumberArray, 0);
        }
    }
}
