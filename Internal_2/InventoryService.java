//  QUESTION 1:
// Develop an advanced inventory management system that reads product data from a CSV file and updates this data in two tables in the database: “products”and “product_inventory”. products( `product_id`, `name`, `category` ) and product_inventory(`product_id`, `quantity`, `warehouse_location`)
// The process involves the following steps:
// 1. Read product data from a CSV file.
// 2. Parse the data to extract relevant fields.
// 3. Validate the data to ensure no duplicate product IDs exist in the file and that all required fields are present. If duplicate product ID is found throw the DuplicateOrderId exception and continue with the next row in csv file. 
// 4. Insert or update the product data into the `products` table.
// 5. Insert or update the inventory data into the `product_inventory` table.
// These steps must be performed within a single transaction to ensure data consistency. If any step fails, the transaction should be rolled back entirely to maintain data integrity.
// Instructions:
// 1. Implement the method `processProductData` in the `InventoryService` class to handle the file I/O and database operations properly.
// 2. Ensure that if reading from the file, validating the data, or updating the database fails, the transaction is rolled back and an appropriate error message is logged.
// 3. Use a transaction to ensure that updates to both tables are atomic.
// 4. Make sure to manage resources appropriately, closing file readers and database connections as needed.
// Scenario Details
// products.csv
// 101,Widget A,Electronics,50,Warehouse 1
// 102,Gadget B,Home,30,Warehouse 2
// 103,Tool C,Hardware,20,Warehouse 3
// 104,Device D,Electronics,40,Warehouse 1
// 105,Appliance E,Home,25,Warehouse 2
// 102,Gadget B,Home,30,Warehouse 2
// 102,Gadget B,Home,30,Warehouse 2
// 107,Instrument F,Medical,15,Warehouse 4
// 107,Apparatus G,Industrial,35,Warehouse 5
// 108,Implement H,Agriculture,10,Warehouse 6
// 109,Equipment I,Sports,22,Warehouse 7
// 110,Machine J,Automotive,27,Warehouse 8  

// Ensure that the database operations are performed within a transaction, rolling back if any operation fails.
// Make sure to close all file readers, writers, and database connections in a `finally` block or use try-with-resources to ensure they are closed even if an exception occurs.
import java.io.*;
import java.util.*;
import java.sql.*;

public class InventoryService {

    public static class DuplicateOrderId extends Throwable {
        public DuplicateOrderId(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) throws IOException{
        FileReader f = new FileReader("products.csv");
        BufferedReader br = new BufferedReader(f);
        Dotenv dotenv = new Dotenv(".env");
        try {
            String s;
            while ((s = br.readLine()) != null) {

                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javainternal", "root", dotenv.get("MYSQL_PASSWORD"));
                    con.setAutoCommit(false);
                    String[] data = s.split(",");
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String category = data[2];
                    int quantity = Integer.parseInt(data[3]);
                    String warehouseLocation = data[4];

                    Savepoint sp = con.setSavepoint();

                    try {
                        PreparedStatement stmt = con.prepareStatement("insert into products(product_id,name,category) VALUES(?,?,?)");
                        stmt.setInt(1, id);
                        stmt.setString(2, name);
                        stmt.setString(3, category);

                        stmt.executeUpdate();

                        PreparedStatement stmt2 = con.prepareStatement("insert into product_inventory(product_id,quantity,warehouse_location) VALUES(?,?,?)");
                        stmt2.setInt(1, id);
                        stmt2.setInt(2, quantity);
                        stmt2.setString(3, warehouseLocation);

                        stmt2.executeUpdate();

                        con.commit();
                        stmt.close();
                        stmt2.close();
                    } catch (Exception e) {
                        con.rollback(sp);
                        System.out.println("Duplicate Id, Rolling back.");
                    }
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                   
            }
            System.out.println("Program executed successfully");

        } catch (Exception e) {
            System.out.println("Error implementing the code");
        } finally {
            br.close();
            f.close();
        }
    }
}
