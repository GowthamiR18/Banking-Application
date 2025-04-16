package daolayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sqloperation {
    public static void selectQuery(Connection connection){

        try {
            String query = "select * from jdbc.user";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String age = rs.getString(3);
                System.out.println("id: " +id+ ", name: " +name+ ", age: " + age);
            }
        } catch (SQLException e) {
            System.out.println("No data fetched" + e);
        }
    }

    public static void insertQuery(Connection connection){
        try {
            String query = "insert into Userdetails.user values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,3);
            ps.setString(2,"Rohit");
            ps.setInt(3,11);
            ps.execute();
            System.out.println("Record inserted successfully");
        } catch (SQLException e) {
            System.out.println("Record not inserted successfully"+ e);
        }
    }

    public static void updateQuery(Connection connection){
        try {
            String query = "update Userdetails.user set name=? where id=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,"Raj");
            ps.setInt(2,1);
            ps.executeUpdate();
            System.out.println("Updated successfully");
        } catch (SQLException e) {
            System.out.println("Not updated successfully"+ e);
        }
    }

    public static void deleteQuery(Connection connection){
        try {
            String query = "delete from Userdetails.user where id =?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,3);
            ps.execute();
            System.out.println("Deleted successfully");
        } catch (SQLException e) {
            System.out.println("Not deleted successfully"+ e);
        }

    }


}

