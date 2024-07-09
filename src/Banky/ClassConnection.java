package Banky;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassConnection {

    private static final String url = "jdbc:mysql://localhost:3306/cbtcip";
    private static final String username = "root";
    private static final String password = "Jayant@2005";

    private Connection conn;

    Connection connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {

            conn = DriverManager.getConnection(url, username, password);

        }catch (SQLException e){
            new PopMessage("Class connection not connect.");
        }
        return conn;
    }

    public static void main(String[] args) {
        ClassConnection cl = new ClassConnection();
        System.out.println(cl.connection());
    }


}
