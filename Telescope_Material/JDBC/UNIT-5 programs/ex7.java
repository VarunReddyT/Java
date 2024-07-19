import java.sql.*;
import java.util.Scanner;

class ex7
{
  public static void main(String args[])  throws Exception
  {
     Connection con;
     CallableStatement cst;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter username and password");
     String s1=sc.next();
     int x=sc.nextInt();
     
    
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
		
    System.out.println("connected");

     cst=con.prepareCall("{call INSERTR(?,?)}");
     cst.setString(1,s1);
     cst.setInt(2,x);
     cst.execute();

     System.out.println("stored procedure executed");
     con.close();
 
  }
}
