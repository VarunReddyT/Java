// Description: Connect to MySQL database and fetch data from emp table.
// JDBC - Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database.
// JDBC API uses JDBC drivers to connect with the database.
// There are 4 types of JDBC drivers:
// 1. JDBC-ODBC bridge driver (Type 1) 
// 2. Native-API driver (Type 2)
// 3. Network Protocol driver (Type 3)
// 4. Thin driver (Type 4)
// MySQL Connector/J is the official JDBC driver for MySQL.
// MySQL Connector/J is a JDBC Type 4 driver.


import java.sql.*;

public class jdbc_1 {
    public static void main(String args[]){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Tvkreddy@2014");
                    
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()){
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            rs.close();
            ResultSet rs2 = stmt.executeQuery("select ename from emp");
            while(rs2.next()){
                System.out.println(rs2.getString(1));
            }
            rs2.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}