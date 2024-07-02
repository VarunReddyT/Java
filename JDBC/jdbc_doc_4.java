// Let's create a Java program to handle the process of a user placing an order. This program will:
// 1. Check the availability of the product.
// 2. Create a new order.
// 3. Update the product's inventory.
// 4. Commit the transaction if all operations succeed or roll back if any operation fails.

import java.sql.*;

public class jdbc_doc_4{
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        PreparedStatement checkStockStmt = null;
        PreparedStatement updateStockStmt = null;
        PreparedStatement insertOrderStmt = null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersProducts", "root", "Tvkreddy@2014");
            con.setAutoCommit(false);

            int userid = 1;
            int productid = 1;
            int orderQuantity = 2;

            checkStockStmt = con.prepareStatement("select Stock from Products where product_id= ?");
            checkStockStmt.setInt(1, productid);
            ResultSet rs = checkStockStmt.executeQuery();

            if(rs.next()){
                int stock = rs.getInt("stock");
                if(stock >= orderQuantity){
                    updateStockStmt = con.prepareStatement("update Products set stock = stock - ? where product_id = ?");
                    updateStockStmt.setInt(1, orderQuantity);
                    updateStockStmt.setInt(2, productid);
                    updateStockStmt.executeUpdate();

                    insertOrderStmt = con.prepareStatement("insert into Orders (user_id, product_id, quantity) values (?, ?, ?)");
                    insertOrderStmt.setInt(1,  userid);
                    insertOrderStmt.setInt(2, productid);
                    insertOrderStmt.setInt(3, orderQuantity);
                    insertOrderStmt.executeUpdate();

                    con.commit();
                    System.out.println("Order placed successfully");
                }
                else{
                    System.out.println("Product out of stock");
                }
            }
        }
        catch(SQLException e){
            if(con != null){
                try{
                    con.rollback();
                    System.out.println("Transaction failed. Rolled back.");
                }
                catch(SQLException e1){
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }
        finally{
            if(checkStockStmt != null){
                try{
                    checkStockStmt.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(updateStockStmt != null){
                try{
                    updateStockStmt.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(insertOrderStmt != null){
                try{
                    insertOrderStmt.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(con != null){
                try{
                    con.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
