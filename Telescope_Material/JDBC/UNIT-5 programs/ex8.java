import java.sql.*;
import java.util.Scanner;

class ex8
{
  public static void main(String args[])  throws Exception
  {
     Connection con;
     CallableStatement cst;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter username:");
     String s1=sc.next();
        
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
		
     System.out.println("connected");

     cst=con.prepareCall("{call getPasswords(?,?)}");
     cst.setString(1,s1);
     cst.registerOutParameter(2, Types.INTEGER);

     cst.execute();
     
     int pw = cst.getInt(2);

     System.out.println("Password is: "+pw);

     System.out.println("stored procedure executed");
     con.close();
 
  }
}
