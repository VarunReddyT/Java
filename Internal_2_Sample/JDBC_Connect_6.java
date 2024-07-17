// 6. Implement a Java program to manage a product database using JDBC. The program should be able to connect to a MySQL database
// insert new products, update product details, delete products, and retrieve product information as given below.

// Dataset: Product Table

// ProductID  	ProductName	Price	  Quantity
// 1		Laptop	                 1200.50	  10
// 2		Mouse	                 25.99	  50
// 3		Keyboard	                 75.00	  30
// 4		Monitor	                 300.00	  20
// 5		Printer	                 150.75	  15
// 6		Router	                 500.22	  3

import java.sql.*;

public class JDBC_Connect_6 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexam", "root", "Tvkreddy@2014");
            Statement stmt = con.createStatement();
            // Create table
            stmt.executeUpdate("create table if not exists Product(ProductID int, ProductName varchar(50), Price double, Quantity int)");
            // Insert data
            stmt.executeUpdate("insert into Product values (1, 'Laptop', 1200.50, 10), (2, 'Mouse', 25.99, 50), (3, 'Keyboard', 75.00, 30), (4, 'Monitor', 300.00, 20), (5, 'Printer', 150.75, 15), (6, 'Router', 500.22, 3)");
            // Update data
            stmt.executeUpdate("update Product set Price = 1300.50 where ProductID = 1");
            // Delete data
            stmt.executeUpdate("delete from Product where ProductID = 2");
            // Retrieve data
            ResultSet rs = stmt.executeQuery("select * from Product");
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getInt(4));
            }
            con.close();
            rs.close();
            stmt.close();

            // executeUpdate is used for statements that modify the database, such as INSERT, UPDATE, and DELETE.
            // executeQuery is used for statements that return a result set, such as SELECT.
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
