// b. Demonstrate with a Java program(use JDBC) to display all the employees who are working in "Dallas" in ascending order of their names. 
import java.util.*;
import java.sql.*;
public class exp_10_b {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        try{
            // Class.forName("com.mysql.jdbc.Driver");
            Dotenv dotenv = new Dotenv(".env");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", dotenv.get("MYSQL_PASSWORD"));
            Statement stmt = con.createStatement();
            String query = "select ename from emp e, dept d where e.deptno=d.deptno and location='Dallas'";
            ResultSet rs = stmt.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            for(int i = 1;i<=cols;i++){
                if(i>1){
                    System.out.println(",");
                }
                String colName = rsmd.getColumnName(i);
                System.out.println(colName);
            }
            while(rs.next()){
                System.out.println(rs.getString(1));
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
