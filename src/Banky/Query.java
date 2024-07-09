package Banky;

import java.sql.*;

public class Query {

    void insertData(Connection conn,String customerId, String firstName, String middleName, String lastName, String dob,
                    String gender, String fatherName, String motherName,
                    String phoneNo, String telNo, String aadhaarNo, String gmail, String currentAddress,
                    String birthAddress, String areaLocality, String landmark, String city,
                    String state, String country, String pinCode, int amount, String accountType){

        try{
            String query = "insert into banky(Customer_Id, First_Name, Middle_Name, Last_Name, D_O_B, Gender, " +
                    "Father_Name, Mother_Name, Phone_No, Telephone_No, Aadhaar_No, G_Mail, Current_Address, " +
                    "Birth_Address, Area_Locality, Landmark, City, State, Country, Pin_Code, Amount, Account_Type)" +
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


            PreparedStatement preparedStatement = conn.prepareStatement(query);


            preparedStatement.setString(1, customerId);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, middleName);
            preparedStatement.setString(4, lastName);
            preparedStatement.setString(5, dob);
            preparedStatement.setString(6, gender);
            preparedStatement.setString(7, fatherName);
            preparedStatement.setString(8, motherName);
            preparedStatement.setString(9, phoneNo);
            preparedStatement.setString(10, telNo);
            preparedStatement.setString(11, aadhaarNo);
            preparedStatement.setString(12, gmail);
            preparedStatement.setString(13, currentAddress);
            preparedStatement.setString(14, birthAddress);
            preparedStatement.setString(15, areaLocality);
            preparedStatement.setString(16, landmark);
            preparedStatement.setString(17, city);
            preparedStatement.setString(18, state);
            preparedStatement.setString(19, country);
            preparedStatement.setString(20,pinCode);
            preparedStatement.setInt(21, amount);
            preparedStatement.setString(22,accountType);

           // done

            int rowAffect = preparedStatement.executeUpdate();


            if(rowAffect > 0){
                String accountNo = accountNoFind(customerId, conn);

                new CompleteOpenAccount(accountType, firstName+" "+middleName+" "+lastName, customerId, accountNo, amount);
            }else{
                new PopMessage("Data not insert.");
//                System.out.println("Data not insert");
            }

        }catch (SQLException e){
            new PopMessage("Query not execute.");
        }


    }

    String accountNoFind(String customerId, Connection conn) {
        int accountNo = 0;

        try{
            Statement statement = conn.createStatement();

            String query = "select Account_No from banky where Customer_Id = '"+customerId+"'";

            ResultSet resultSet = statement.executeQuery(query);

           while (resultSet.next()){
               accountNo = resultSet.getInt("Account_No");
           }

        }catch (SQLException e){
            new PopMessage("Account number not found.");
        }

        return Integer.toString(accountNo);
    }

    int getAmount(Connection conn, int accountNo){
        int amount = 0;
        try{
            Statement statement = conn.createStatement();

            String query = "select Amount from banky where Account_No = "+accountNo;

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                amount = resultSet.getInt("Amount");
            }

        }catch (SQLException e){
            new PopMessage("Amount not found.");
        }

        return amount;

    }

    void updateAmount(Connection conn, int amount, int accountNo){
        try{
            Statement statement = conn.createStatement();
            String query = String.format("update banky set Amount = %d where Account_No = %d",amount,accountNo);
            statement.executeUpdate(query);

        }catch (SQLException e){
            new PopMessage("Amount not update.");
        }

    }

    int deleteAccount(Connection conn, int accountNo){
        int row = 0;
        try{
            Statement statement = conn.createStatement();
            String query = String.format("delete from banky where Account_No = %d",accountNo);
            row = statement.executeUpdate(query);
        }catch (SQLException e){
            new PopMessage("Account not delete.");
        }

        return row;


    }

    public static void main(String[] args) {
        Query q = new Query();
        ClassConnection cl = new ClassConnection();
        Connection conn = cl.connection();
//        q.insertData(conn, "HBS2005", "Mr", "Jayant", "Kumar", "21/07/2005", "Male", "Subhash Chand", "Shashibala",
//                "9870891594", "10018008", "510211075330", "jayantsagar2005@gmail.com", "Village - Jalalpur Dhana",
//                "Post - Jalalpur Dhana", "Jalalpur Dhana", "Prathama Bank", "Amroha", "Uttar Pradesh", "India",
//                "244221", 500, "Saving Account");

//        q.updateAmount(conn, 100,7733002);

    }
}
