package OnlineQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Quiz extends JFrame implements ActionListener {
    public static String[][] ques = new String[100][5];
    public static String[][] ans = new String[100][2];
    public static String[][] userAns = new String[10][1];
    public static int[] randomNumberArray = new int[10];
    public static JLabel qno,question;
    public static JRadioButton op1,op2,op3,op4;
    public static JButton next, lifeLine, submit;
    // maximum time set
    public static int timer = 30;
    public static ButtonGroup groupOption;
    // answer selected (yes/no)
    public static int ansSelected = 0;
    // question number
    public  static  int count = 0;
    // find score
    public static int score = 0;
    String username;
    public static Random random = new Random();
    public static int randomNumber;



    Quiz(String username){

        score = 0;
        this.username = username;

        getContentPane().setBackground(Color.pink);
        setLayout(null);

        // image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz Image/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,-155,800,350);
        add(image);

        // label (qno)
        qno = new JLabel();
        qno.setBounds(10,30,100,400);
        qno.setFont(new Font("Times New Roman",Font.BOLD,20));
        qno.setForeground(Color.black);
        add(qno);

        // label (question)
        question = new JLabel();
        question.setBounds(35,30,750,400);
        question.setFont(new Font("Times New Roman",Font.BOLD,20));
        question.setForeground(Color.black);
        add(question);

        // radio button(option 1)
        op1 = new JRadioButton("Option 1");
        op1.setBounds(20,250,500,20);
        op1.setFont(new Font("Times New Roman",Font.ITALIC,20));
        op1.setForeground(Color.black);
        op1.setBackground(Color.pink);
        add(op1);

        // radio button(option 2)
        op2 = new JRadioButton("Option 2");
        op2.setBounds(20,280,600,20);
        op2.setFont(new Font("Times New Roman",Font.ITALIC,20));
        op2.setBackground(Color.pink);
        op2.setForeground(Color.black);
        add(op2);

        // radio button(option 3)
        op3 = new JRadioButton("Option 3");
        op3.setBounds(20,310,600,20);
        op3.setFont(new Font("Times New Roman",Font.ITALIC,20));
        op3.setBackground(Color.pink);
        op3.setForeground(Color.black);
        add(op3);

        // radio button(option 4)
        op4 = new JRadioButton("Option 4");
        op4.setBounds(20,340,600,20);
        op4.setFont(new Font("Times New Roman",Font.ITALIC,20));
        op4.setBackground(Color.pink);
        op4.setForeground(Color.black);
        add(op4);

        // group of all option (one select to another dis-select)
        groupOption = new ButtonGroup();
        groupOption.add(op1);
        groupOption.add(op2);
        groupOption.add(op3);
        groupOption.add(op4);

        // button next
        next = new JButton("Next Quiz");
        next.setBounds(620,300,150,35);
        next.setFont(new Font("Times New Roman",Font.BOLD,20));
        next.setBackground(Color.black);
        next.setForeground(Color.green);
        next.addActionListener(this);
        add(next);

        // button life-line
        lifeLine = new JButton("Life-Line");
        lifeLine.setBounds(620,350,150,35);
        lifeLine.setFont(new Font("Times New Roman",Font.BOLD,20));
        lifeLine.setBackground(Color.black);
        lifeLine.setForeground(Color.green);
        lifeLine.addActionListener(this);
        add(lifeLine);

        // button submit
        submit = new JButton("Submit");
        submit.setBounds(620,400,150,35);
        submit.setFont(new Font("Times New Roman",Font.BOLD,20));
        submit.setBackground(Color.black);
        submit.setForeground(Color.green);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

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

        //      question 10
        ques[10][0] = "The set of instructions given to the computer.";
        ques[10][1] = "Commands";
        ques[10][2] = "Program";
        ques[10][3] = "hardware";
        ques[10][4] = "None of these";

        //      question 11
        ques[11][0] = "What is the full form of URL ?";
        ques[11][1] = "Uniform Resource Locator";
        ques[11][2] = "Uniform Resource Link";
        ques[11][3] = "Uniform Registered Link";
        ques[11][4] = "Unified Resource Link";

        //      question 12
        ques[12][0] = "The set of programs to do a specific task.";
        ques[12][1] = "Interpreter";
        ques[12][2] = "Assembler";
        ques[12][3] = "Software";
        ques[12][4] = "None of these";

        // question 13
        ques[13][0] = "What is the full form of GUI ?";
        ques[13][1] = "Graphical User Interface";
        ques[13][2] = "Graphical User Instrument";
        ques[13][3] = "Graphical Unified Instrument";
        ques[13][4] = "Graphical Unified Interface";

        // question 14
        ques[14][0] = "What is Linux ?";
        ques[14][1] = "Firmware";
        ques[14][2] = "Application program";
        ques[14][3] = "Malware";
        ques[14][4] = "Operating System";

        //      question 15
        ques[15][0] = "The language that is directly understood by the computer.";
        ques[15][1] = "Assembly";
        ques[15][2] = "Basic";
        ques[15][3] = "Machine";
        ques[15][4] = "None of these";



        //      question 16
        ques[16][0] = "Which type of a storage device is USB ?";
        ques[16][1] = "Secondary";
        ques[16][2] = "Primary";
        ques[16][3] = "Tertiary";
        ques[16][4] = "None of these";

        //      question 17
        ques[17][0] = "What is full form of SQL ?";
        ques[17][1] = "Structured Query List";
        ques[17][2] = "Simple Query Language";
        ques[17][3] = "Simple Query List";
        ques[17][4] = "Structured Query Language";

        //      question 18
        ques[18][0] = "These many bits forms a byte";
        ques[18][1] = "Four(4)";
        ques[18][2] = "Eight(8)";
        ques[18][3] = "Two(2)";
        ques[18][4] = "Sixteen(16)";

        //      question 19
        ques[19][0] = "What is the full form DDL ?";
        ques[19][1] = "Data Definition Language";
        ques[19][2] = "Dynamic Data Language";
        ques[19][3] = "Detailed Data Language";
        ques[19][4] = "Data Derivation Language";

        //      question 20
        ques[20][0] = "One of the following is not an operating system.";
        ques[20][1] = "MS-Windows";
        ques[20][2] = "MS-Office";
        ques[20][3] = "MAC OS";
        ques[20][4] = "Android";

        //      question 21
        ques[21][0] = "The most important system software for PC's.";
        ques[21][1] = "MS-Office";
        ques[21][2] = "MS-Window";
        ques[21][3] = "Anti-Virus";
        ques[21][4] = "None of these";

        //      question 22
        ques[22][0] = "What does DML stand for ?";
        ques[22][1] = "Different Mode Level";
        ques[22][2] = "Data Model Language";
        ques[22][3] = "Data Model Lane";
        ques[22][4] = "Data Manipulation Language";

        //      question 23
        ques[23][0] = "Which of the following is a DDL command ?";
        ques[23][1] = "ALTER";
        ques[23][2] = "INSERT";
        ques[23][3] = "SELECT";
        ques[23][4] = "UPDATE";

        //      question 24
        ques[24][0] = "One of the following is not a programming language.";
        ques[24][1] = "C/C++";
        ques[24][2] = "Java";
        ques[24][3] = "Mac";
        ques[24][4] = "Python";

        //      question 25
        ques[25][0] = "The operating system for Apple Mac computers";
        ques[25][1] = "Windows";
        ques[25][2] = "Linus";
        ques[25][3] = "Mac OS";
        ques[25][4] = "None of these";

        //      question 26
        ques[26][0] = "Which of the following is not a text function ?";
        ques[26][1] = "TRUNCATE()";
        ques[26][2] = "MID()";
        ques[26][3] = "TRIM()";
        ques[26][4] = "LEFT()";

        //      question 27
        ques[27][0] = "The most used open source operating system.";
        ques[27][1] = "MacOSX";
        ques[27][2] = "Linux";
        ques[27][3] = "Obuntu";
        ques[27][4] = "None of these";

        //      question 28
        ques[28][0] = "Which of the following is not a numeric function ?";
        ques[28][1] = "MID";
        ques[28][2] = "SIGN";
        ques[28][3] = "MOD";
        ques[28][4] = "POW";

        //      question 29
        ques[29][0] = "Which of the following is not a data function ?";
        ques[29][1] = "Month";
        ques[29][2] = "NOW";
        ques[29][3] = "Year";
        ques[29][4] = "POW";

        //      question 30
        ques[30][0] = "Ms-Excel is distributed by this company.";
        ques[30][1] = "Mitsubishi";
        ques[30][2] = "Microsoft";
        ques[30][3] = "Apple";
        ques[30][4] = "IBM";

        //      question 31
        ques[31][0] = "Which of the following is not an aggregate function ?";
        ques[31][1] = "With";
        ques[31][2] = "Avg";
        ques[31][3] = "Sum";
        ques[31][4] = "Min";

        //      question 32
        ques[32][0] = "Which clause is used with 'aggregate functions' ?";
        ques[32][1] = "WHERE";
        ques[32][2] = "SELECT";
        ques[32][3] = "Both 1 and 2";
        ques[32][4] = "GROUP BY";

        //      question 33
        ques[33][0] = "An Excel files is also called as this.";
        ques[33][1] = "Workbook";
        ques[33][2] = "Spreadsheet";
        ques[33][3] = "Document";
        ques[33][4] = "None of these";

        //      question 34
        ques[34][0] = "Which of the following is not a join type ?";
        ques[34][1] = "Empty join";
        ques[34][2] = "Natural condition";
        ques[34][3] = "Equi join";
        ques[34][4] = "Right join";

        //      question 35
        ques[35][0] = "The basic unit of the spreadsheet.";
        ques[35][1] = "Column";
        ques[35][2] = "Row";
        ques[35][3] = "Cell";
        ques[35][4] = "Both 1 & 2";

        //      question 36
        ques[36][0] = "The function that is used to check a condition.";
        ques[36][1] = "sum";
        ques[36][2] = "if";
        ques[36][3] = "average";
        ques[36][4] = "for";

        //      question 37
        ques[37][0] = "What is the  other name of MINUS operator ?";
        ques[37][1] = "UNION";
        ques[37][2] = "UNION ALL";
        ques[37][3] = "INTERSECT";
        ques[37][4] = "EXCEPT";

        //      question 38
        ques[38][0] = "Hub is a ";
        ques[38][1] = "Broadcast device";
        ques[38][2] = "Unicast device";
        ques[38][3] = "Multicast device";
        ques[38][4] = "None of the above";

        //      question 39
        ques[39][0] = "HTML is used to create one of these.";
        ques[39][1] = "documents for painting";
        ques[39][2] = "documents for web";
        ques[39][3] = "documents for e-mail";
        ques[39][4] = "none of these";

        //      question 40
        ques[40][0] = "All normal web pages consist of these two parts.";
        ques[40][1] = "Body and Soul";
        ques[40][2] = "Top and Bottom";
        ques[40][3] = "Head and Body";
        ques[40][4] = "None of these";

        //      question 41
        ques[41][0] = "Switch is a ";
        ques[41][1] = "Broadcast device";
        ques[41][2] = "Multicast device";
        ques[41][3] = "Bridge";
        ques[41][4] = "Unicast device";

        //      question 42
        ques[42][0] = "Html tags can be written in one of these options.";
        ques[42][1] = "capital letter";
        ques[42][2] = "small letters";
        ques[42][3] = "both capital & small letters";
        ques[42][4] = "none of these";

        //      question 43
        ques[43][0] = "Internet is an example of ";
        ques[43][1] = "Bus topology";
        ques[43][2] = "Star topology";
        ques[43][3] = "Bus topology";
        ques[43][4] = "Mesh topology";

        //      question 44
        ques[44][0] = "A web-site is a collection of ";
        ques[44][1] = "HTML documents";
        ques[44][2] = "Graphic files";
        ques[44][3] = "audio and video files";
        ques[44][4] = "All of above";

        //      question 45
        ques[45][0] = "All HTML tags are enclosed within this";
        ques[45][1] = "# and #";
        ques[45][2] = "? and !";
        ques[45][3] = "<>";
        ques[45][4] = ";";

        //      question 46
        ques[46][0] = "IP stand for ";
        ques[46][1] = "Internet Protocol";
        ques[46][2] = "Intranet Protocol";
        ques[46][3] = "Internet Package";
        ques[46][4] = "Internet Provider";

        //      question 47
        ques[47][0] = "Which of these is not a part of URl ?";
        ques[47][1] = "IP address";
        ques[47][2] = "Port Number";
        ques[47][3] = "Domain Name";
        ques[47][4] = "None of these";

        //      question 48
        ques[48][0] = "Which of the following is the full form of ALU ?";
        ques[48][1] = "Arithmetical Logic Unit";
        ques[48][2] = "Arithmetical Logical Unit";
        ques[48][3] = "Arithmetic Logic Unit";
        ques[48][4] = "None of these";

        //      question 49
        ques[49][0] = "URLs are two types : ";
        ques[49][1] = "Absolute & Relative";
        ques[49][2] = "Absolute & Dynamic";
        ques[49][3] = "Static & Dynamic";
        ques[49][4] = "None of the above";

        //      question 50
        ques[50][0] = "Which of the following is an example of a volatile memory.";
        ques[50][1] = "Hard disk";
        ques[50][2] = "ROM";
        ques[50][3] = "RAM";
        ques[50][4] = "None of these";

        //      question 51
        ques[51][0] = "Which units controls all the perts of a computer system ?";
        ques[51][1] = "CPU";
        ques[51][2] = "ALU";
        ques[51][3] = "CU";
        ques[51][4] = "MU";

        //      question 52
        ques[52][0] = "An email can be sent via, ";
        ques[52][1] = "PC";
        ques[52][2] = "Tablet";
        ques[52][3] = "Smart phone";
        ques[52][4] = "All of the above";

        //      question 53
        ques[53][0] = "Chatting on Internet is ";
        ques[53][1] = "Online textual talk";
        ques[53][2] = "Talking face to face";
        ques[53][3] = "Talking on phone";
        ques[53][4] = "None of these";

        //      question 54
        ques[54][0] = "Into how many types, is the Ram further subdivided ?";
        ques[54][1] = "4";
        ques[54][2] = "3";
        ques[54][3] = "2";
        ques[54][4] = "5";

        //      question 55
        ques[55][0] = "Which of the following is not an input device ?";
        ques[55][1] = "Scanner";
        ques[55][2] = "Joystick";
        ques[55][3] = "Monitor";
        ques[55][4] = "Keyboard";

        //      question 56
        ques[56][0] = "Online textual talk is called ";
        ques[56][1] = "Video Conferencing";
        ques[56][2] = "Telephony";
        ques[56][3] = "Text Phone";
        ques[56][4] = "Chat";

        //      question 57
        ques[57][0] = "Which of the following is an output device ?";
        ques[57][1] = "Hard disk";
        ques[57][2] = "Joystick";
        ques[57][3] = "Monitor";
        ques[57][4] = "Microphone";

        //      question 58
        ques[58][0] = "What is an example of e-waste ?";
        ques[58][1] = "an old computer";
        ques[58][2] = "a ripened banana";
        ques[58][3] = "old clothes";
        ques[58][4] = "empty soda cans";

        //      question 59
        ques[59][0] = "Which of the following is primary memory ?";
        ques[59][1] = "RAM";
        ques[59][2] = "Floppy disk";
        ques[59][3] = "Hard disk";
        ques[59][4] = "None of these";

        //      question 60
        ques[60][0] = "Which of the is a storage device ?";
        ques[60][1] = "Modem";
        ques[60][2] = "Headphones";
        ques[60][3] = "Compact disc";
        ques[60][4] = "CPU";

        //      question 61
        ques[61][0] = "Which of the following is not a part of CPU ?";
        ques[61][1] = "Memory unit";
        ques[61][2] = "ALU";
        ques[61][3] = "Control Unit";
        ques[61][4] = "Input device";

        //      question 62
        ques[62][0] = "Which of the following ia a low-level language ?";
        ques[62][1] = "C++";
        ques[62][2] = "C";
        ques[62][3] = "Java";
        ques[62][4] = "Assembly language";

        //      question 63
        ques[63][0] = "Which of the following is not a storage device ?";
        ques[63][1] = "DVD";
        ques[63][2] = "Printer";
        ques[63][3] = "Memory card";
        ques[63][4] = "CD-ROM";

        //      question 64
        ques[64][0] = "Secondary memory included ";
        ques[64][1] = "CD";
        ques[64][2] = "ROM";
        ques[64][3] = "RAM";
        ques[64][4] = "All of these";

        //      question 65
        ques[65][0] = "What is the full form of OMR ?";
        ques[65][1] = "Optical Markup Reader";
        ques[65][2] = "Optical Marks Reader";
        ques[65][3] = "Optical Marked Reader";
        ques[65][4] = "Optical Markup Read";

        //      question 66
        ques[66][0] = "Which of the following is a type of network ?";
        ques[66][1] = "SAN";
        ques[66][2] = "MAN";
        ques[66][3] = "NAN";
        ques[66][4] = "TAN";

        //      question 67
        ques[67][0] = "What is data strucure ?";
        ques[67][1] = "A way to store and organize data";
        ques[67][2] = "A programming language";
        ques[67][3] = "A collection of algorithm";
        ques[67][4] = "A type of computer hardware";

        //      question 68
        ques[68][0] = "Which of the following is not the type of queue ?";
        ques[68][1] = "Single ended queue";
        ques[68][2] = "Priority queue";
        ques[68][3] = "Circular queue";
        ques[68][4] = "Ordinary queue";

        //      question 69
        ques[69][0] = "Which of the following is the full form of IM ?";
        ques[69][1] = "Instant Message";
        ques[69][2] = "Instant Messaging";
        ques[69][3] = "Internal Messaging";
        ques[69][4] = "None of these";

        //      question 70
        ques[70][0] = "Which of of the following is a type of media ?";
        ques[70][1] = "Mouse";
        ques[70][2] = "Text";
        ques[70][3] = "Keyboard";
        ques[70][4] = "Printer";

        //      question 71
        ques[71][0] = "Which algorithm is used in the top tree data structure ?";
        ques[71][1] = "Divide and Conquer";
        ques[71][2] = "Backtracking";
        ques[71][3] = "Branch";
        ques[71][4] = "Greedy";

        //      question 72
        ques[72][0] = "Which is a hybrid cloud a combination of ?";
        ques[72][1] = "Both hybrid and private cloud";
        ques[72][2] = "Both public and private cloud";
        ques[72][3] = "Two public clouds";
        ques[72][4] = "Two private clouds";

        //      question 73
        ques[73][0] = "Who is the father of C language ?";
        ques[73][1] = "Steve Jobs";
        ques[73][2] = "James Gosling";
        ques[73][3] = "Rasmus Lerdorf";
        ques[73][4] = "Dennis Ritchie";

        //      question 74
        ques[74][0] = "All keyword in C are in ________";
        ques[74][1] = "LowerCase letters";
        ques[74][2] = "UpperCase letters";
        ques[74][3] = "CamelCase letters";
        ques[74][4] = "None of the mentioned";

        //      question 75
        ques[75][0] = "Which of the following ia an example of GUI based OS ?";
        ques[75][1] = "MS-Word";
        ques[75][2] = "MS-DOS";
        ques[75][3] = "Windows-7";
        ques[75][4] = "Unix";

        //      question 76
        ques[76][0] = "Which is valid C expression ?";
        ques[76][1] = "int my_num = 100000;";
        ques[76][2] = "int my_num = 100,000;";
        ques[76][3] = "int my num = 1000;";
        ques[76][4] = "int $my_num = 10000;";

        //      question 77
        ques[77][0] = "What is an example of iteration in C ?";
        ques[77][1] = "for";
        ques[77][2] = "while";
        ques[77][3] = "do-while";
        ques[77][4] = "All of the mentioned";

        //      question 78
        ques[78][0] = "Which type of a user interface requires a mouse ?";
        ques[78][1] = "CUI";
        ques[78][2] = "GUI";
        ques[78][3] = "Both 1 and 2";
        ques[78][4] = "None of these";

        //      question 79
        ques[79][0] = "Which of the following is not a part of an e-mail ?\"";
        ques[79][1] = "Outbox";
        ques[79][2] = "Inbox";
        ques[79][3] = "Reply";
        ques[79][4] = "None of these";

        //      question 80
        ques[80][0] = "Which of the following allows video uploading ?";
        ques[80][1] = "Dropbox";
        ques[80][2] = "Picasa";
        ques[80][3] = "You Tube";
        ques[80][4] = "None of these";

        //      question 81
        ques[81][0] = "What is the full form of VIRUS ?";
        ques[81][1] = "Vital Information Record Under Seize";
        ques[81][2] = "Vast Information Resource Under Seize";
        ques[81][3] = "Vital Information Resource Under Seize";
        ques[81][4] = "None of these";

        //      question 82
        ques[82][0] = "What is #include<stdio.h> ?";
        ques[82][1] = "Preprocessor directive";
        ques[82][2] = "Inclusion directive";
        ques[82][3] = "File inclusion directive";
        ques[82][4] = "None of the mentioned";

        //      question 83
        ques[83][0] = "Which of the following is an antivirus software";
        ques[83][1] = "Quick Heal Total Security";
        ques[83][2] = "Norton antivirus";
        ques[83][3] = "McAfee antivirus";
        ques[83][4] = "All of these";

        //      question 84
        ques[84][0] = "Which is the use of the Pen blocks ?";
        ques[84][1] = "To create programs";
        ques[84][2] = "To create software";
        ques[84][3] = "To create interactive games";
        ques[84][4] = "all of these";

        //      question 85
        ques[85][0] = "Which types of language is Python ?";
        ques[85][1] = "Compiled";
        ques[85][2] = "Interpreted";
        ques[85][3] = "Both 1 and 2";
        ques[85][4] = "None of these";

        //      question 86
        ques[86][0] = "C preprocessor can have compiler specific features :";
        ques[86][1] = "True";
        ques[86][2] = "False";
        ques[86][3] = "Depends on the standard";
        ques[86][4] = "Depend on the platform";

        //      question 87
        ques[87][0] = "Which types of a language is Python ?";
        ques[87][1] = "Procedural";
        ques[87][2] = "Object-Oriented";
        ques[87][3] = "Low-level-language";
        ques[87][4] = "None of these";

        //      question 88
        ques[88][0] = "Which of the following are C preprocessors ?";
        ques[88][1] = "#ifdef";
        ques[88][2] = "#define";
        ques[88][3] = "#endif";
        ques[88][4] = "all of the mentioned";

        //      question 89
        ques[89][0] = "The C preprocessors are specified with __________ symbol.";
        ques[89][1] = "#";
        ques[89][2] = "$";
        ques[89][3] = "' '";
        ques[89][4] = "&";

        //      question 90
        ques[90][0] = "Which is a set of sequential statements, called ?";
        ques[90][1] = "Code";
        ques[90][2] = "Program";
        ques[90][3] = "Pseudo Code";
        ques[90][4] = "Programming language";

        //      question 91
        ques[91][0] = "In C language, FILE is of which data type ?";
        ques[91][1] = "struct";
        ques[91][2] = "char*";
        ques[91][3] = "int";
        ques[91][4] = "None of the mentioned";

        //      question 92
        ques[92][0] = "What is the sizeof(char) in a32-bit C compiler ?";
        ques[92][1] = "1 byte";
        ques[92][2] = "1 bit";
        ques[92][3] = "2 bytes";
        ques[92][4] = "2 bits";

        //      question 93
        ques[93][0] = "What is the smallest unit of memory ?";
        ques[93][1] = "Byte";
        ques[93][2] = "Bit";
        ques[93][3] = "Kilobyte";
        ques[93][4] = "Gigabyte";

        //      question 94
        ques[94][0] = "Function in C language are always _________ ";
        ques[94][1] = "External";
        ques[94][2] = "Internal";
        ques[94][3] = "Both 1 and 2";
        ques[94][4] = "Internal & External are not vaild terms for fuction";

        //      question 95
        ques[95][0] = "Which types of device is a keyboard ?";
        ques[95][1] = "Storage Device";
        ques[95][2] = "Output Device";
        ques[95][3] = "Input Device";
        ques[95][4] = "All of these";

        //      question 96
        ques[96][0] = "What does IT stand for ?";
        ques[96][1] = "Integrated Technology";
        ques[96][2] = "Information Technology";
        ques[96][3] = "Intelligent Technology";
        ques[96][4] = "Interesting Technology";

        //      question 97
        ques[97][0] = "Which of the following cannot be a variable name in C ?";
        ques[97][1] = "volatile";
        ques[97][2] = "true";
        ques[97][3] = "friend";
        ques[97][4] = "export";

        //      question 98
        ques[98][0] = "Which of the following is not a valid C variable name ?";
        ques[98][1] = "int number;";
        ques[98][2] = "float rate;";
        ques[98][3] = "int variable_name;";
        ques[98][4] = "int $main;";

        //      question 99
        ques[99][0] = "What does WWW stand for ?";
        ques[99][1] = "World Whole Web";
        ques[99][2] = "Wide World Web";
        ques[99][3] = "World Wide Web";
        ques[99][4] = "Web World Wide";

        //  answer questions
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
        ans[10][1] = "Program";
        ans[11][1] = "Uniform Resource Locator";
        ans[12][1] = "Software";
        ans[13][1] = "Graphical User Interface";
        ans[14][1] = "Operating System";
        ans[15][1] = "Machine";
        ans[16][1] = "Secondary";
        ans[17][1] = "Structured Query Language";
        ans[18][1] = "Eight(8)";
        ans[19][1] = "Data Definition Language";
        ans[20][1] = "MS-Office";
        ans[21][1] = "MS-Window";
        ans[22][1] = "Data Manipulation Language";
        ans[23][1] = "ALTER";
        ans[24][1] = "Mac";
        ans[25][1] = "Mac OS";
        ans[26][1] = "TRUNCATE()";
        ans[27][1] = "Linux";
        ans[28][1] = "MID";
        ans[29][1] = "POW";
        ans[30][1] = "Microsoft";
        ans[31][1] = "With";
        ans[32][1] = "GROUP BY";
        ans[33][1] = "Spreadsheet";
        ans[34][1] = "Empty join";
        ans[35][1] = "Cell";
        ans[36][1] = "if";
        ans[37][1] = "EXCEPT";
        ans[38][1] = "Broadcast device";
        ans[39][1] = "documents for web";
        ans[40][1] = "Head and Body";
        ans[41][1] = "Unicast device";
        ans[42][1] = "both capital & small letters";
        ans[43][1] = "Mesh topology";
        ans[44][1] = "All of above";
        ans[45][1] = "<>";
        ans[46][1] = "Internet Provider";
        ans[47][1] = "IP address";
        ans[48][1] = "Arithmetic Logic Unit";
        ans[49][1] = "Absolute & Relative";
        ans[50][1] = "RAM";
        ans[51][1] = "CU";
        ans[52][1] = "All of the above";
        ans[53][1] = "Online textual talk";
        ans[54][1] = "2";
        ans[55][1] = "Monitor";
        ans[56][1] = "Chat";
        ans[57][1] = "Monitor";
        ans[58][1] = "an old computer";
        ans[59][1] = "RAM";
        ans[60][1] = "Compact disc";
        ans[61][1] = "Memory unit";
        ans[62][1] = "Assembly language";
        ans[63][1] = "Printer";
        ans[64][1] = "CD";
        ans[65][1] = "Optical Marks Reader";
        ans[66][1] = "MAN";
        ans[67][1] = "A way to store and organize data";
        ans[68][1] = "Single ended queue";
        ans[69][1] = "Instant Messaging";
        ans[70][1] = "Text";
        ans[71][1] = "Divide and Conquer";
        ans[72][1] = "Both public and private cloud";
        ans[73][1] = "Dennis Ritchie";
        ans[74][1] = "LowerCase letters";
        ans[75][1] = "Windows-7";
        ans[76][1] = "int my_num = 100000;";
        ans[77][1] = "All of the mentioned";
        ans[78][1] = "GUI";
        ans[79][1] = "None of these";
        ans[80][1] = "You Tube";
        ans[81][1] = "Vital Information Resource Under Seize";
        ans[82][1] = "Preprocessor directive";
        ans[83][1] = "All of these";
        ans[84][1] = "To create interactive games";
        ans[85][1] = "Interpreted";
        ans[86][1] = "True";
        ans[87][1] = "Object-Oriented";
        ans[88][1] = "all of the mentioned";
        ans[89][1] = "#";
        ans[90][1] = "Program";
        ans[91][1] = "struct";
        ans[92][1] = "1 byte";
        ans[93][1] = "Bit";
        ans[94][1] = "External";
        ans[95][1] = "Input Device";
        ans[96][1] = "Information Technology";
        ans[97][1] = "volatile";
        ans[98][1] = "int $main;";
        ans[99][1] = "World Wide Web";


        // function call (start question)
        start(count);

        // main frame function
        setSize(800,500);
        setLocation(330,180);
        setVisible(true);
        setTitle("Happy Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next){

            // time restart
            repaint();
            // show all option
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            //
            ansSelected = 1;

            // any option not select but next button click perform this condition
            if (groupOption.getSelection() == null){
                userAns[count][0] = "";
            }else{
                userAns[count][0] = groupOption.getSelection().getActionCommand();
            }

            // count is 8 next button disable and submit button enable
            if (count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

            // life-line button action perform
        } else if (e.getSource() == lifeLine) {
            if (randomNumber%3==0 || randomNumber%5==0){
                // randomNumber%3==0 || randomNumber%5==0 if disable option 1 and option 4
                op1.setEnabled(false);
                op4.setEnabled(false);
            }else{
                // count is 0,2,4,6,9 if disable option 2 and option 3
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            // life-line button is used only one time , used after life-line button disabled
            lifeLine.setEnabled(false);
        }else {
            // any option not select but submit button click perform this condition
            if (groupOption.getSelection() == null) {
                userAns[count][0] = "";
            } else {
                userAns[count][0] = groupOption.getSelection().getActionCommand();
            }

            int temp;

            for (int i=0; i<userAns.length; i++){
                temp = randomNumberArray[i];
                if (userAns[i][0].equals(ans[temp][1])){
                    score = score + 10;
                }
            }



            setVisible(false);
            count = 0;
            timer = 30;
            try {
                new Score(score, username,ques,ans,userAns,randomNumberArray);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        // time label
        String time = "Left Time : "+timer+" seconds";
        g.setFont(new Font("Times New Roman",Font.BOLD,23));

        if(timer>=20){
            g.setColor(Color.black);
        } else if (timer>=10) {
            g.setColor(Color.yellow);
        }else {
            g.setColor(Color.red);
        }

        // timer greater than 0
        if (timer>0){
            g.drawString(time,560,300);
        }else {
            g.drawString("Times Up!!",640,300);
        }

        // time decrement
        timer--;

        // time millisecond 1 second = 1000 millisecond
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // answer is selected this condition perform
        if (ansSelected == 1){
            ansSelected = 0;
            timer = 30;
            // time is less than 0 this condition perform
        } else if (timer<0) {

            timer = 30;

            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            if (count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9){
                if (groupOption.getSelection() == null) {
                    userAns[count][0] = "";
                } else {
                    userAns[count][0] = groupOption.getSelection().getActionCommand();
                }

                // work pending
                int temp;

                for (int i=0; i<userAns.length; i++){
                    temp = randomNumberArray[i];
                    if (userAns[i][0].equals(ans[temp][1])){
                        score = score + 10;
                    }
                }

                setVisible(false);
                count = 0;
                try {
                    new Score(score,username,ques,ans,userAns,randomNumberArray);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }else {
                ansSelected = 1;

                if (groupOption.getSelection() == null) {
                    userAns[count][0] = "";
                } else {
                    userAns[count][0] = groupOption.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }

    public static void start(int count) {

        randomNumber  = random.nextInt(100);
        randomNumber = randomNumber - 1;

        boolean checkNumber  = verifyNumber(randomNumber);

        if (checkNumber){
            start(count);
        }else{
            randomNumberArray[count] = randomNumber;
        }

        // question number
        qno.setText((count+1)+".");
        question.setText(ques[randomNumber][0]);

        // option 1
        op1.setText(ques[randomNumber][1]);
        op1.setActionCommand(ques[randomNumber][1]);

        // option 2
        op2.setText(ques[randomNumber][2]);
        op2.setActionCommand(ques[randomNumber][2]);

        // option 3
        op3.setText(ques[randomNumber][3]);
        op3.setActionCommand(ques[randomNumber][3]);

        // option 4
        op4.setText(ques[randomNumber][4]);
        op4.setActionCommand(ques[randomNumber][4]);

        // another option select to dis-select select option
        groupOption.clearSelection();


    }

    public static boolean verifyNumber(int number) {

        for (int j : randomNumberArray) {
            if (number == j) {
                return true;
            }
        }

        return false;

    }


}
