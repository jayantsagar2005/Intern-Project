package Banky;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Objects;

public class OpenAccount extends JFrame implements ActionListener {
    JComboBox lFirstName, lDays, lMonth, lYear, lGender, lState, lCountry, lAccountType;
    JTextField tDepositMoney, tMiddleName, tLastName, tFatherName, tMotherName, tPhoneNo, tTelNo, tAadhaarNo, tMail,
            tCurrentAddress, tBirthAddress, tAreaLocality, tLandmark, tCity, tPinCode;
    JButton back, clear, submit;

    OpenAccount(){
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        LocalDate now = LocalDate.now();
        String date1 = now.toString();
        JLabel date = new JLabel("Date : " + date1);
        date.setFont(new Font("Impact",Font.BOLD,25));
        date.setBounds(20,10,200,30);
        add(date);


        JLabel title = new JLabel("Welcome Sir, Please fill our information to open new account.");
        title.setBounds(10,50,1000,50);
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(title);

        JLabel personalDetails = new JLabel("PERSONAL DETAILS");
        personalDetails.setBounds(10,100,500,50);
        personalDetails.setForeground(Color.RED);
        personalDetails.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(personalDetails);

        JLabel accountType = new JLabel("Account Type* : ");
        accountType.setBounds(800,50,500,50);
        accountType.setForeground(Color.black);
        accountType.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(accountType);

        String[] accountName = { "Select", "Savings Account", "Checking Account","Joint Account","Student Account", "Minor Account","Salary Account","Current Account", "Business Account" };
        lAccountType = new JComboBox(accountName);
        lAccountType.setBounds(950,60,210,30);
        add(lAccountType);

        JLabel depositMoney = new JLabel("Deposit Money* : ");
        depositMoney.setBounds(1180,50,500,50);
        depositMoney.setForeground(Color.black);
        depositMoney.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(depositMoney);

        tDepositMoney = new JTextField();
        tDepositMoney.setBounds(1350,55,150,40);
        tDepositMoney.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tDepositMoney);



        JLabel name = new JLabel("First Name* : ");
        name.setBounds(40,140,500,50);
        name.setForeground(Color.black);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(name);

        String[] s1 = {"Select", "Mr.", "Mrs.", "Shree", "Kumari" };
        lFirstName = new JComboBox(s1);
        lFirstName.setBounds(170,150,150,30);
        add(lFirstName);

        JLabel middleName = new JLabel("Middle Name* : ");
        middleName.setBounds(360,140,500,50);
        middleName.setForeground(Color.black);
        middleName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(middleName);

        tMiddleName = new JTextField();
        tMiddleName.setBounds(500,145,400,40);
        tMiddleName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tMiddleName);

        JLabel lastName = new JLabel("Last Name : ");
        lastName.setBounds(950,140,500,50);
        lastName.setForeground(Color.black);
        lastName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(lastName);

        tLastName = new JTextField();
        tLastName.setBounds(1070,145,400,40);
        tLastName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tLastName);

        JLabel dob = new JLabel("Date Of Birth* : ");
        dob.setBounds(40,200,500,50);
        dob.setForeground(Color.black);
        dob.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(dob);

        String[] days = {"Select","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
                "20",
                "21","22","23","24","25","26","27","28","29","30","31"};
        String[] months = {"Select","January","February","March","April","May","June","July","August","September",
                "October",
                "November","December"};
        String[] years = {"Select","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2010",
                "2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};

        lDays = new JComboBox(days);
        lDays.setBounds(180,210,70,30);
        add(lDays);

        lMonth = new JComboBox(months);
        lMonth.setBounds(260,210,100,30);
        add(lMonth);

        lYear = new JComboBox(years);
        lYear.setBounds(370,210,80,30);
        add(lYear);

        JLabel sex = new JLabel("Gender* : ");
        sex.setBounds(480,200,500,50);
        sex.setForeground(Color.black);
        sex.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(sex);

        String[] gender = {"Select", "Male", "Female", "Other"};

        lGender = new JComboBox(gender);
        lGender.setBounds(580,210,100,30);
        add(lGender);

        JLabel fatherName = new JLabel("Father Name* : ");
        fatherName.setBounds(720,200,500,50);
        fatherName.setForeground(Color.black);
        fatherName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(fatherName);

        tFatherName = new JTextField();
        tFatherName.setBounds(870,205,400,40);
        tFatherName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tFatherName);

        JLabel motherName = new JLabel("Mother Name* : ");
        motherName.setBounds(40,260,500,50);
        motherName.setForeground(Color.black);
        motherName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(motherName);

        tMotherName = new JTextField();
        tMotherName.setBounds(190,265,400,40);
        tMotherName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tMotherName);

        JLabel phoneNo = new JLabel("Phone No.* : ");
        phoneNo.setBounds(620,260,500,50);
        phoneNo.setForeground(Color.black);
        phoneNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(phoneNo);

        tPhoneNo = new JTextField();
        tPhoneNo.setBounds(740,265,250,40);
        tPhoneNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tPhoneNo);

        JLabel telNo = new JLabel("Telephone No. : ");
        telNo.setBounds(1030,260,500,50);
        telNo.setForeground(Color.black);
        telNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(telNo);

        tTelNo = new JTextField();
        tTelNo.setBounds(1180,265,250,40);
        tTelNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tTelNo);

        JLabel aadhaarNo = new JLabel("Aadhaar No.* : ");
        aadhaarNo.setBounds(40,320,500,50);
        aadhaarNo.setForeground(Color.black);
        aadhaarNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(aadhaarNo);

        tAadhaarNo = new JTextField();
        tAadhaarNo.setBounds(180,325,300,40);
        tAadhaarNo.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAadhaarNo);

        JLabel mail = new JLabel("G-Mail* : ");
        mail.setBounds(520,320,500,50);
        mail.setForeground(Color.black);
        mail.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(mail);

        tMail = new JTextField();
        tMail.setBounds(620,325,400,40);
        tMail.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tMail);

        JLabel address = new JLabel("ADDRESS");
        address.setBounds(10,390,500,50);
        address.setForeground(Color.RED);
        address.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(address);

        JLabel currentAddress = new JLabel("Current Address* : ");
        currentAddress.setBounds(40,440,500,50);
        currentAddress.setForeground(Color.black);
        currentAddress.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(currentAddress);

        tCurrentAddress = new JTextField();
        tCurrentAddress.setBounds(230,445,1100,40);
        tCurrentAddress.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tCurrentAddress);

        JLabel birthAddress = new JLabel("Birth Address : ");
        birthAddress.setBounds(40,500,500,50);
        birthAddress.setForeground(Color.black);
        birthAddress.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(birthAddress);

        tBirthAddress = new JTextField();
        tBirthAddress.setBounds(230,505,1100,40);
        tBirthAddress.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tBirthAddress);

        JLabel areaLocality = new JLabel("Area/Locality : ");
        areaLocality.setBounds(40,560,500,50);
        areaLocality.setForeground(Color.black);
        areaLocality.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(areaLocality);

        tAreaLocality = new JTextField();
        tAreaLocality.setBounds(230,565,500,40);
        tAreaLocality.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tAreaLocality);

        JLabel landmark = new JLabel("Landmark : ");
        landmark.setBounds(780,560,500,50);
        landmark.setForeground(Color.black);
        landmark.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(landmark);

        tLandmark = new JTextField();
        tLandmark.setBounds(920,565,500,40);
        tLandmark.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tLandmark);

        JLabel city = new JLabel("City* : ");
        city.setBounds(40,620,500,50);
        city.setForeground(Color.black);
        city.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(city);

        tCity = new JTextField();
        tCity.setBounds(130,625,350,40);
        tCity.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tCity);

        JLabel state = new JLabel("State* : ");
        state.setBounds(520,620,500,50);
        state.setForeground(Color.black);
        state.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(state);

        String[] stateName = {"Select","Uttar Pradesh","Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
                "Chhattisgarh", "Goa",
                "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala",
                "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland",
                "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
                "Uttar Pradesh", "Uttarakhand", "West Bengal"};

        lState = new JComboBox(stateName);
        lState.setBounds(600,625,180,40);
        add(lState);

        JLabel country = new JLabel("Country* : ");
        country.setBounds(820,620,500,50);
        country.setForeground(Color.black);
        country.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(country);

        String[] countryName = {"Select","India", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua " +
                "and " +
                "Barbuda", "Argentina",
                "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
                "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina",
                "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia",
                "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros",
                "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Croatia", "Cuba",
                "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor",
                "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia",
                "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada",
                "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India",
                "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan",
                "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia",
                "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar",
                "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius",
                "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
                "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria",
                "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay",
                "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis",
                "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe",
                "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia",
                "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname",
                "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga",
                "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates",
                "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela",
                "Vietnam", "Yemen", "Zambia", "Zimbabwe"};

        lCountry = new JComboBox(countryName);
        lCountry.setBounds(920,625,180,40);
        add(lCountry);

        JLabel pinCode = new JLabel("Pin Code* : ");
        pinCode.setBounds(1130,620,500,50);
        pinCode.setForeground(Color.black);
        pinCode.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(pinCode);

        tPinCode = new JTextField();
        tPinCode.setBounds(1250,625,200,40);
        tPinCode.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tPinCode);

        back = new JButton("BACK");
        back.setBounds(530,720,150,40);
        back.setFont(new Font("Times New Roman",Font.BOLD,28));
        back.setBackground(Color.orange);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        clear = new JButton("CLEAR");
        clear.setBounds(710,720,150,40);
        clear.setFont(new Font("Times New Roman",Font.BOLD,28));
        clear.setBackground(Color.orange);
        clear.setForeground(Color.black);
        clear.addActionListener(this);
        add(clear);

        submit = new JButton("SUBMIT");
        submit.setBounds(890,720,150,40);
        submit.setFont(new Font("Times New Roman",Font.BOLD,28));
        submit.setBackground(Color.orange);
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        add(submit);


        setSize(1600, 900);
        setLocation(-5, 0);
        setVisible(true);
        setTitle("Open Account");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new OpenAccount();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            setVisible(false);
            new Home();
        } else if (e.getSource() == clear) {
            setVisible(false);
            new OpenAccount();
        }else{
            String accountType = (String) lAccountType.getSelectedItem();
            String depositMoney = tDepositMoney.getText().replaceAll("\\s", "");
            String firstName = (String) lFirstName.getSelectedItem();
            String middleName = tMiddleName.getText().replaceAll("\\s", "");
            String lastName = tLastName.getText().replaceAll("\\s", "");
            String day = (String) lDays.getSelectedItem();
            String month = (String) lMonth.getSelectedItem();
            String year = (String) lYear.getSelectedItem();
            String gender = (String) lGender.getSelectedItem();
            String fatherName = tFatherName.getText();
            String motherName = tMotherName.getText();
            String phoneNo = tPhoneNo.getText().replaceAll("\\s", "");
            String telNo = tTelNo.getText().replaceAll("\\s", "");
            String aadhaarNo = tAadhaarNo.getText().replaceAll("\\s", "");
            String gMail = tMail.getText().replaceAll("\\s", "");
            String currentAddress = tCurrentAddress.getText();
            String birthAddress = tBirthAddress.getText();
            String areaLocality = tAreaLocality.getText();
            String landmark = tLandmark.getText();
            String city = tCity.getText().replaceAll("\\s", "");
            String state = (String) lState.getSelectedItem();
            String country = (String) lCountry.getSelectedItem();
            String pinCode = tPinCode.getText().replaceAll("\\s", "");



            if (Objects.equals(accountType, "Select")){
                new PopMessage("Select account type.");
            } else if (depositMoney.isEmpty() || !integerCheck(depositMoney)) {
                new PopMessage("Enter deposit amount or correct amount.");
            } else if (Objects.equals(firstName, "Select")) {
                new PopMessage("Select first name.");
            } else if (middleName.isEmpty() || !stringCheck(middleName)) {
                new PopMessage("Enter middle name or correct name.");
            } else if (!lastName.isEmpty() && !stringCheck(lastName)) {
                new PopMessage("Enter last name or correct name.");
            } else if (Objects.equals(day, "Select")) {
                new PopMessage("Select birth day.");
            }else if (Objects.equals(month, "Select")) {
                new PopMessage("Select birth month.");
            }else if (Objects.equals(year, "Select")) {
                new PopMessage("Select birth year.");
            } else if (Objects.equals(gender, "Select")) {
                new PopMessage("Select gender.");
            } else if (fatherName.isEmpty() || !stringCheck(fatherName)) {
                new PopMessage("Enter father name or correct name.");
            } else if (motherName.isEmpty() || !stringCheck(motherName)) {
                new PopMessage("Enter mother name or correct name.");
            } else if (phoneNo.isEmpty() || !integerCheck(phoneNo) || phoneNo.length() != 10) {
                new PopMessage("Enter phone number or correct number.");
            } else if (!telNo.isEmpty() && !integerCheck(telNo)) {
                new PopMessage("Enter telephone number or correct number.");
            } else if (aadhaarNo.isEmpty() || !integerCheck(aadhaarNo) || aadhaarNo.length() != 12) {
                new PopMessage("Enter aadhaar number or correct number.");
            } else if (!gMail.endsWith("@gmail.com")) {
                new PopMessage("Enter gmail or correct gmail.");
            } else if (currentAddress.isEmpty()) {
                new PopMessage("Enter current address.");
            } else if (city.isEmpty() || !stringCheck(city)) {
                new PopMessage("Enter city name or correct city.");
            } else if (Objects.equals(state, "Select")) {
                new PopMessage("Select state.");
            } else if (Objects.equals(country, "Select")) {
                new PopMessage("Select country.");
            } else if (pinCode.isEmpty() || !integerCheck(pinCode) || pinCode.length() != 6) {
                new PopMessage("Enter pin number number or correct number.");
            }else{
                ClassConnection cl = new ClassConnection();
                Connection conn = cl.connection();
                Query query = new Query();
                int amount = Integer.parseInt(depositMoney);
                setVisible(false);
                new OpenAccount();
                query.insertData(conn, "HBS"+phoneNo.substring(3), firstName,middleName, lastName, day+"/"+month+"/"+year,
                        gender, fatherName, motherName, phoneNo, telNo, aadhaarNo, gMail, currentAddress, birthAddress,
                        areaLocality, landmark, city, state, country, pinCode, amount, accountType);


            }


        }
    }

    public static boolean integerCheck(String str) {
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if((int) ch < 48 || (int) ch > 57){
                return false;
            }
        }
        return true;
    }

    public static boolean stringCheck(String str) {
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if((int) ch >= 48 && (int) ch <= 57){
                return false;
            }
        }
        return true;
    }
}
