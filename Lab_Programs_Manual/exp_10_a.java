// 10. a. Demonstrate with a Java Program (using JDBC) to display all the employees who are working in the given department. Read department number from the user. Also display records in the ascending order of "employee name".

import java.util.*;
import java.sql.*;
public class exp_10_a {
    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department number : ");
        int deptNum = sc.nextInt();
        try{
            Dotenv dotenv = new Dotenv(".env");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", dotenv.get("MYSQL_PASSWORD"));
                        
            Statement st = con.createStatement();
            String query = "select ename from emp where deptno="+deptNum+" order by ename asc";
            ResultSet rs = st.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();

            int cols = rsmd.getColumnCount();
            for(int i = 1;i<=cols;i++){
                if(i>1){
                    System.out.print(","); 
                }
                String colName = rsmd.getColumnName(i);
                System.out.println(colName);
            }
            while(rs.next()){
                for(int i = 1;i<=cols;i++){
                    if(i>1){
                        System.out.println(",");
                    }
                    String colValue = rs.getString(i);
                    System.out.println(colValue);
                }
            }
            rs.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
