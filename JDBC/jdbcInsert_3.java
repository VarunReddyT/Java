// Print the following
// a. Total number os iphones
// b. Phonenames of all phones within 500 along with model number
// c. All models belonging to brand Samsung
// d. The cheapest phone in Nothing brand
// e. Sorted phones in the order of price range


import java.sql.*;
public class jdbcInsert_3 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartphonesDB", "root", "Tvkreddy@2014");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select count(Smartphone) from smartphones where Brand = 'Apple'");

            while(rs.next()){
                System.out.println("Total number of iphones: " + rs.getInt(1));
            }
            rs.close();

            ResultSet rs2 = stmt.executeQuery("select Smartphone from smartphones where FinalPrice < 500");

            while(rs2.next()){
                System.out.println("Phone name: " + rs2.getString(1));
            }
            rs2.close();

            ResultSet rs3 = stmt.executeQuery("select Model from smartphones where Brand = 'Samsung'");
            while(rs3.next()){
                System.out.println(rs3.getString(1));
            }

            rs3.close();

            ResultSet rs4 = stmt.executeQuery("select Smartphone from smartphones where Brand = 'Nothing' order by FinalPrice limit 1");    
            while(rs4.next()){
                System.out.println("Cheapest phone in Nothing brand: " + rs4.getString(1));
            }
            rs4.close();

            ResultSet rs5 = stmt.executeQuery("select Smartphone, FinalPrice from smartphones order by FinalPrice");
            while(rs5.next()){
                System.out.println(rs5.getString(1) + " " + rs5.getString(2));
            }
            rs5.close();
            con.close();

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}