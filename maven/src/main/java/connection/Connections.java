package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
    private final static String URL = "jdbc:mysql://localhost:3306/jdbc";
    private final static String USERNAME= "root";
    private final static String PASSWORD= "root";

    public static Connection getConnectionof(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Class found successfully");
            connection =(Connection) DriverManager.getConnection(URL,USERNAME, PASSWORD);

            System.out.println("connected successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;



    }
}
