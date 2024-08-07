// c. Demonstrate with a Java program(use JDBC) to read three values dept no,dept name and location from the user and insert the corresponding record into the dept table.
import java.util.*;
import java.sql.*;
public class exp_10_c {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department no. : ");
        int deptNo = sc.nextInt();
        System.out.println("Enter department name : ");
        String deptName = sc.next();
        System.out.println("Enter department location : ");
        String deptLocation = sc.next();

        try{
            Dotenv dotenv = new Dotenv(".env");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", dotenv.get("MYSQL_PASSWORD"));
            
            String query = "insert into dept(deptno,dname,location) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, deptNo);
            pstmt.setString(2, deptName);
            pstmt.setString(3, deptLocation);
            int status = pstmt.executeUpdate();
            if(status>0){
                System.out.println("Records inserted successfully");
            }

            pstmt.close();
            con.close();
            sc.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
