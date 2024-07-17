// 15. Write a Java program that connects to a MySQL database using JDBC, creates a table named contacts, and inserts a record into it. The table contacts should have the following columns: id (INT), name (VARCHAR), phone_number (VARCHAR), and email (VARCHAR). Ensure the program loads the JDBC driver, establishes a connection, and handles exceptions appropriately. Use prepared statements to insert a record with the following values: id = 1, name = "John Doe", phone_number = "123-456-7890", and email = "john.doe@example.com".

import java.sql.*;
public class JDBC_Table_15 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexam", "root", "Tvkreddy@2014");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("create table if not exists contacts(id INT, name VARCHAR(40), phone_number VARCHAR(20), email VARCHAR(30))");

            PreparedStatement ps = con.prepareStatement("insert into contacts(id,name,phone_number,email) VALUES(?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "John Doe");
            ps.setString(3, "123-456-7890");
            ps.setString(4, "john.doe@example.com");

            ps.executeUpdate();

            stmt.close();
            ps.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
