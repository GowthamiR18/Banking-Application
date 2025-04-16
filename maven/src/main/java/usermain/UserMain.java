package usermain;

import connection.Connections;
import daolayer.Sqloperation;

import java.sql.Connection;

public class UserMain {
    public static void main(String[] args) {
        Connection connection = Connections.getConnectionof();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter id:");
//        int id= sc.nextInt();
//        System.out.print("Enter name:");
//        String name = sc.nextLine();
//        System.out.print("Enter age:");
//        int age = sc.nextInt();
//
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        user.setAge(age);



        Sqloperation.selectQuery(connection);

    }
}
