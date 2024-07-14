package OnlineQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Solution extends JFrame implements ActionListener {

    public static JLabel qno, question,temp;
    public static JButton next, previous, submit;
    public static JRadioButton op1,op2,op3,op4;

    public String[][] ques;
    public String[][] ans;
    public String[][] userAns;
    public int[] randomNumberArray;
    public int idx;

    Solution(String[][] ques, String[][] ans, String[][] userAns, int[] randomNumberArray, int idx) {

        this.ques = ques;
        this.ans = ans;
        this.userAns = userAns;
        this.randomNumberArray = randomNumberArray;
        this.idx = idx;

        int index = randomNumberArray[idx];


        getContentPane().setBackground(Color.pink);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, -155, 800, 350);
        add(image);

        qno = new JLabel(String.valueOf(index));
        qno.setBounds(10, 30, 100, 400);
        qno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        qno.setForeground(Color.black);
        add(qno);

        question = new JLabel();
        question.setBounds(35, 30, 750, 400);
        question.setFont(new Font("Times New Roman", Font.BOLD, 20));
        question.setForeground(Color.black);
        add(question);

        if (Objects.equals(ques[index][1], ans[index][1]) && Objects.equals(userAns[idx][0], ans[index][1])) {
            op1 = new JRadioButton("Option 1");
            op1.setBounds(20, 250, 500, 20);
            op1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op1.setSelected(true);
            op1.setForeground(Color.green);
            op1.setBackground(Color.pink);
            add(op1);
        } else if (Objects.equals(ques[index][1], ans[index][1])) {
            op1 = new JRadioButton("Option 1");
            op1.setBounds(20, 250, 500, 20);
            op1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op1.setForeground(Color.green);
            op1.setBackground(Color.pink);
            add(op1);
        } else if (Objects.equals(ques[index][1], userAns[idx][0])) {
            op1 = new JRadioButton("Option 1");
            op1.setBounds(20, 250, 500, 20);
            op1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op1.setSelected(true);
            op1.setForeground(Color.red);
            op1.setBackground(Color.pink);
            add(op1);
        } else {
            op1 = new JRadioButton("Option 1");
            op1.setBounds(20, 250, 500, 20);
            op1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op1.setForeground(Color.black);
            op1.setBackground(Color.pink);
            add(op1);
        }

        // option 2

        if (Objects.equals(ques[index][2], ans[index][1]) && Objects.equals(userAns[idx][0], ans[index][1])) {
            op2 = new JRadioButton("Option 2");
            op2.setBounds(20, 280, 500, 20);
            op2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op2.setSelected(true);
            op2.setForeground(Color.green);
            op2.setBackground(Color.pink);
            add(op2);
        } else if (Objects.equals(ques[index][2], ans[index][1])) {
            op2 = new JRadioButton("Option 2");
            op2.setBounds(20, 280, 500, 20);
            op2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op2.setForeground(Color.green);
            op2.setBackground(Color.pink);
            add(op2);
        } else if (Objects.equals(ques[index][2], userAns[idx][0])) {
            op2 = new JRadioButton("Option 2");
            op2.setBounds(20, 280, 500, 20);
            op2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op2.setSelected(true);
            op2.setForeground(Color.red);
            op2.setBackground(Color.pink);
            add(op2);
        } else {
            op2 = new JRadioButton("Option 2");
            op2.setBounds(20, 280, 500, 20);
            op2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op2.setForeground(Color.black);
            op2.setBackground(Color.pink);
            add(op2);
        }

        // option 3

        if (Objects.equals(ques[index][3], ans[index][1]) && Objects.equals(userAns[idx][0], ans[index][1])) {
            op3 = new JRadioButton("Option 3");
            op3.setBounds(20, 310, 500, 20);
            op3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op3.setSelected(true);
            op3.setForeground(Color.green);
            op3.setBackground(Color.pink);
            add(op3);
        } else if (Objects.equals(ques[index][3], ans[index][1])) {
            op3 = new JRadioButton("Option 3");
            op3.setBounds(20, 310, 500, 20);
            op3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op3.setForeground(Color.green);
            op3.setBackground(Color.pink);
            add(op3);
        } else if (Objects.equals(ques[index][3], userAns[idx][0])) {
            op3 = new JRadioButton("Option 3");
            op3.setBounds(20, 310, 500, 20);
            op3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op3.setSelected(true);
            op3.setForeground(Color.red);
            op3.setBackground(Color.pink);
            add(op3);
        } else {
            op3 = new JRadioButton("Option 3");
            op3.setBounds(20, 310, 500, 20);
            op3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op3.setForeground(Color.black);
            op3.setBackground(Color.pink);
            add(op3);
        }

        // option 4

        if (Objects.equals(ques[index][4], ans[index][1]) && Objects.equals(userAns[idx][0], ans[index][1])) {
            op4 = new JRadioButton("Option 1");
            op4.setBounds(20, 340, 500, 20);
            op4.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op4.setSelected(true);
            op4.setForeground(Color.green);
            op4.setBackground(Color.pink);
            add(op4);
        } else if (Objects.equals(ques[index][4], ans[index][1])) {
            op4 = new JRadioButton("Option 4");
            op4.setBounds(20, 340, 500, 20);
            op4.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op4.setForeground(Color.green);
            op4.setBackground(Color.pink);
            add(op4);
        } else if (Objects.equals(ques[index][4], userAns[idx][0])) {
            op4 = new JRadioButton("Option 4");
            op4.setBounds(20, 340, 500, 20);
            op4.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op4.setSelected(true);
            op4.setForeground(Color.red);
            op4.setBackground(Color.pink);
            add(op4);
        } else {
            op4 = new JRadioButton("Option 4");
            op4.setBounds(20, 340, 500, 20);
            op4.setFont(new Font("Times New Roman", Font.ITALIC, 20));
            op4.setForeground(Color.black);
            op4.setBackground(Color.pink);
            add(op4);
        }

        next = new JButton("Next Quiz");
        next.setBounds(620, 300, 150, 35);
        next.setFont(new Font("Times New Roman", Font.BOLD, 20));
        next.setBackground(Color.black);
        next.setForeground(Color.green);
        next.addActionListener(this);
        add(next);

        previous = new JButton("Previous Quiz");
        previous.setBounds(620, 350, 150, 35);
        previous.setFont(new Font("Times New Roman", Font.BOLD, 18));
        previous.setBackground(Color.black);
        previous.setForeground(Color.green);
        previous.addActionListener(this);
        add(previous);

        submit = new JButton("Start Quiz");
        submit.setBounds(620, 400, 150, 35);
        submit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        submit.setBackground(Color.black);
        submit.setForeground(Color.orange);
        submit.addActionListener(this);
        add(submit);

        start(index);

        setSize(800, 500);
        setLocation(330, 180);
        setVisible(true);
        setTitle("Happy Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        String[][] ques = new String[10][5];
        String[][] ans = new String[10][2];
        String[][] userAns = new String[10][1];
        int[] randomNumberArray = {0,1,2,3,4,5,6,7,8,9};

        //      question 0
        ques[0][0] = "Who invented Java Programming?";
        ques[0][1] = "Guido van Rossum";
        ques[0][2] = "Bjarne Stroustrup";
        ques[0][3] = "James Gosling";
        ques[0][4] = "Dennis Ritchie";

        //      question 1
        ques[1][0] = "Which one of the following is not a Java features?";
        ques[1][1] = "Use of pointer";
        ques[1][2] = "Portable";
        ques[1][3] = "Object-Oriented";
        ques[1][4] = "Dynamic and Extensible";

        //      question 2
        ques[2][0] = "What is the extension of java code files?";
        ques[2][1] = ".java";
        ques[2][2] = ".js";
        ques[2][3] = ".txt";
        ques[2][4] = ".class";

        //      question 3
        ques[3][0] = "What is the extension of compiled java classes?";
        ques[3][1] = ".txt";
        ques[3][2] = ".js";
        ques[3][3] = ".class";
        ques[3][4] = ".java";

        //      question 4
        ques[4][0] = "Which of these are selection statement in Java?";
        ques[4][1] = "if()";
        ques[4][2] = "break";
        ques[4][3] = "continue";
        ques[4][4] = "for()";

        //      question 5
        ques[5][0] = "Who is the father of Computer?";
        ques[5][1] = "James Gosling";
        ques[5][2] = "Charles Babbage";
        ques[5][3] = "Dennis Ritchie";
        ques[5][4] = "Bjarne Stroustrup";

        //      question 6
        ques[6][0] = "What is the full form of CPU?";
        ques[6][1] = "Computer Principal Unit";
        ques[6][2] = "Computer Processing Unit";
        ques[6][3] = "Central Processing Unit";
        ques[6][4] = "Control Processing Unit";

        //      question 7
        ques[7][0] = "Which of the following is the brain of the computer?";
        ques[7][1] = "Memory";
        ques[7][2] = "Control Unit";
        ques[7][3] = "Arithmetic and Logic Unit";
        ques[7][4] = "Central Processing Unit";

        //      question 8
        ques[8][0] = "Which of the following is not a characteristic of a computer?";
        ques[8][1] = "Versatility";
        ques[8][2] = "Accuracy";
        ques[8][3] = "Diligence";
        ques[8][4] = "I.Q.";

        //      question 9
        ques[9][0] = "Which of the following can access the server?";
        ques[9][1] = "Web Server";
        ques[9][2] = "User";
        ques[9][3] = "Web Client";
        ques[9][4] = "Web Browser";


        // correct answer
        ans[0][1] = "James Gosling";
        ans[1][1] = "Use of pointer";
        ans[2][1] = ".java";
        ans[3][1] = ".class";
        ans[4][1] = "if()";
        ans[5][1] = "Charles Babbage";
        ans[6][1] = "Central Processing Unit";
        ans[7][1] = "Central Processing Unit";
        ans[8][1] = "I.Q.";
        ans[9][1] = "Web Client";

        // user answer
        userAns[0][0] = "Guido van Rossum";
        userAns[1][0] = "Portable";
        userAns[2][0] = ".js";
        userAns[3][0] = ".class";
        userAns[4][0] = "for()";
        userAns[5][0] = "James Gosling";
        userAns[6][0] = "Computer Processing Unit";
        userAns[7][0] = "Arithmetic and Logic Unit";
        userAns[8][0] = "I.Q.";
        userAns[9][0] = "Web Server";

        new Solution(ques, ans, userAns, randomNumberArray, 0);
    }
    public void start(int index) {

        // question number
        qno.setText((idx+1)+".");
        question.setText(ques[index][0]);

        // option 1
        op1.setText(ques[index][1]);
        op1.setActionCommand(ques[index][1]);

        // option 2
        op2.setText(ques[index][2]);
        op2.setActionCommand(ques[index][2]);

        // option 3
        op3.setText(ques[index][3]);
        op3.setActionCommand(ques[index][3]);

        // option 4
        op4.setText(ques[index][4]);
        op4.setActionCommand(ques[index][4]);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next && idx < 9){
            setVisible(false);
            idx++;
            new Solution(ques, ans, userAns, randomNumberArray, idx);
        } else if (e.getSource() == previous && idx > 0) {
            setVisible(false);
            idx--;
            new Solution(ques, ans, userAns, randomNumberArray, idx);
        } else if (e.getSource() == submit) {
            setVisible(false);
            new LogIn();
        }
    }
}
