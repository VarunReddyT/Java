// TO retrieve records- validation
import java.io.*;
import java.sql.*;
import java.util.*;

public class ex4 
{
public static void main(String args[]) throws Exception
{
  Connection con;
  PreparedStatement pst;
  ResultSet rs;

   Scanner  sc=new Scanner(System.in);

   System.out.println("Enter Username");
   String  u=sc.nextLine();
		
   System.out.println("Enter Password");
   String  p=sc.nextLine();
		
   try
  {
  		
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
		
 	
   pst=con.prepareStatement("select * from login where username=? and password=?");
		
   pst.setString(1,u);
   pst.setString(2,p);

   rs=pst.executeQuery();
		
   if(rs.next())
        System.out.println("welcome, "+u);
   else
        System.out.println("sorry, you are not an authorized user");
		
    rs.close();
    pst.close();
    con.close();
  }
  catch(Exception e)
  {
     System.out.println(e);
   }
 }
}

