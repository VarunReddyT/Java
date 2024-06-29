// 1.create the customers table and populate it with some sample data.
// 2. -- Create the 'customers' table
// CREATE TABLE customers (
//     id INT PRIMARY KEY AUTO_INCREMENT,
//     name VARCHAR(100) NOT NULL,
//     email VARCHAR(100) NOT NULL,
//     phone VARCHAR(20) NOT NULL
// );

// -- Insert sample data into the 'customers' table
// INSERT INTO customers (name, email, phone) VALUES
// ('Alice Smith', 'alice.smith@example.com', '555-1234'),
// ('Bob Johnson', 'bob.johnson@example.com', '555-5678'),
// ('Charlie Brown', 'charlie.brown@example.com', '555-8765'),
// ('Diana Prince', 'diana.prince@example.com', '555-4321'),
// ('Edward Norton', 'edward.norton@example.com', '555-9876'),
// ('Fiona Gallagher', 'fiona.gallagher@example.com', '555-1111'),
// ('George Michael', 'george.michael@example.com', '555-2222'),
// ('Hannah Baker', 'hannah.baker@example.com', '555-3333'),
// ('Isaac Newton', 'isaac.newton@example.com', '555-4444'),
// ('Jessica Jones', 'jessica.jones@example.com', '555-5555'),
// ('Kevin Bacon', 'kevin.bacon@example.com', '555-6666'),
// ('Lara Croft', 'lara.croft@example.com', '555-7777'),
// ('Michael Scott', 'michael.scott@example.com', '555-8888'),
// ('Nancy Drew', 'nancy.drew@example.com', '555-9999'),
// ('Oscar Wilde', 'oscar.wilde@example.com', '555-0000'),
// ('Pam Beesly', 'pam.beesly@example.com', '555-1010'),
// ('Quentin Tarantino', 'quentin.tarantino@example.com', '555-2020'),
// ('Rachel Green', 'rachel.green@example.com', '555-3030'),
// ('Steve Rogers', 'steve.rogers@example.com', '555-4040'),
// ('Tony Stark', 'tony.stark@example.com', '555-5050');
// You are tasked with developing a Customer Records Management System for a company. The system should allow customer service representatives to view and navigate through customer records stored in a MySQL database. The system must provide functionality to:
// 1.	Display the first customer record when the application starts.
// 2.	Allow navigation to the next, previous, first, or last customer record.
// 3.	Display appropriate messages when trying to navigate beyond the available records.
// 4.	Allow the user to exit the application.
// Requirements
// 1.	Display Customer Details: When navigating through the records, display the customer's ID, name, email, and phone number.
// 2.	Navigation Commands:
// o	[N]ext: Move to the next record.
// o	[P]revious: Move to the previous record.
// o	[F]irst: Move to the first record.
// o	[L]ast: Move to the last record.
// o	[E]xit: Exit the application.
// o	[I]nsert: Insert a new record
// o	[D]elete: Delete the record
// 3.	Error Handling: Display appropriate messages when attempting to navigate past the first or last record.

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class jdbc_test {


    public static void main(String[] args) throws IOException {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexam", "root",
                    "Tvkreddy@2014");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            // String createTableSQL = "CREATE TABLE IF NOT EXISTS customers ( id INT
            // PRIMARY KEY AUTO_INCREMENT, name VARCHAR (100) NOT NULL, email VARCHAR(100)
            // NOT NULL, phone VARCHAR(20) NOT NULL)";
            // stmt.executeUpdate(createTableSQL);

            // String insertValues = "INSERT INTO customers (name, email, phone)
            // VALUES('Alice Smith', 'alice.smith@example.com', '555-1234'),('Bob Johnson',
            // 'bob.johnson@example.com', '555-5678'),('Charlie Brown',
            // 'charlie.brown@example.com', '555-8765'),('Diana Prince',
            // 'diana.prince@example.com', '555-4321'),('Edward Norton',
            // 'edward.norton@example.com', '555-9876'),('Fiona Gallagher',
            // 'fiona.gallagher@example.com', '555-1111'),('George Michael',
            // 'george.michael@example.com', '555-2222'),('Hannah Baker',
            // 'hannah.baker@example.com', '555-3333'),('Isaac Newton',
            // 'isaac.newton@example.com', '555-4444'),('Jessica Jones',
            // 'jessica.jones@example.com', '555-5555'),('Kevin Bacon',
            // 'kevin.bacon@example.com', '555-6666'),('Lara Croft',
            // 'lara.croft@example.com', '555-7777'),('Michael Scott',
            // 'michael.scott@example.com', '555-8888'),('Nancy Drew',
            // 'nancy.drew@example.com', '555-9999'),('Oscar Wilde',
            // 'oscar.wilde@example.com', '555-0000'),('Pam Beesly',
            // 'pam.beesly@example.com', '555-1010'),('Quentin Tarantino',
            // 'quentin.tarantino@example.com', '555-2020'),('Rachel Green',
            // 'rachel.green@example.com', '555-3030'),('Steve Rogers',
            // 'steve.rogers@example.com', '555-4040'),('Tony Stark',
            // 'tony.stark@example.com', '555-5050');";

            // ResultSet rs = stmt.executeQuery(insertValues);

            String choice;
            Scanner s = new Scanner(System.in);

            ResultSet rs = stmt.executeQuery("select * from customers");

            rs.next();
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            

            boolean flag = true;

            while (true) {
                System.out.println("o\t[N]ext: Move to the next record.");
                System.out.println("o\t[P]revious: Move to the previous record.");
                System.out.println("o\t[F]irst: Move to the first record.");
                System.out.println("o\t[L]ast: Move to the last record.");
                System.out.println("o\t[E]xit: Exit the application.");
                System.out.println("o\t[I]nsert: Insert a new record");
                System.out.println("o\t[D]elete: Delete the record");

                System.out.println("Enter choice : ");
                choice = s.next();

                switch (choice) {
                    case "N":
                        try {
                            rs.next();
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                        } catch (SQLException e) {
                            System.out.println("No more records found");
                        }
                        break;

                    case "P":
                        try {
                            rs.previous();
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

                        } catch (SQLException e) {
                            System.out.println("No previous records found");
                        }
                        break;
                    case "F":
                        try {
                            rs.first();
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

                        } catch (SQLException e) {
                            System.out.println("No previous records found");
                        }
                        break;
                    case "L":
                        try {
                            rs.last();
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                        } catch (SQLException e) {
                            System.out.println("No mode records found");
                        }
                        break;
                    case "E":
                        flag = false;
                        break;
                    case "I":
                        System.out.println("Enter name to insert : ");
                        String name = s.next();
                        System.out.println("Enter email to insert : ");
                        String email = s.next();
                        System.out.println("Enter phone to insert : ");
                        String phone = s.next();
                        rs.moveToInsertRow(); 
                        rs.updateString(2, name); 
                        rs.updateString(3,email); 
                        rs.updateString(4, phone); 
                        rs.insertRow();
                        rs.moveToCurrentRow();
                    case "D":
                        try{
                            rs.deleteRow();
                        }
                        catch(SQLException e){
                            System.out.println("No records left");
                        }
                    default:
                        break;
                }
                if (flag == false) {
                    break;
                }
            }

            stmt.close();
            con.close();
            s.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}