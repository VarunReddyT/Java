import java.sql.*;

public class jdbc_1 {
    public static void main(String args[]){
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee", "root", "Tvkreddy@2014");
                    
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            ResultSet rs2 = stmt.executeQuery("select ename from emp");
            while (rs.next()){
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            while(rs2.next()){
                System.out.println(rs2.getString(1));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}