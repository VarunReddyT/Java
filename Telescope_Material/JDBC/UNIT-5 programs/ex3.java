import java.io.*;
import java.sql.*;

public class ex3
 {
public static void main(String args[])// throws Exception
{
  Connection con;
  Statement st;
  ResultSet rs;	//to store group of records
		
  try
 {
   
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
		
   st=con.createStatement();
		
   rs=st.executeQuery("select * from Employee ");
		
   while(rs.next())
   {
       System.out.println("ENO=" + rs.getInt(1) + "    ");  
       System.out.println("EMPNAME=" + rs.getString(2) + "    ");
       System.out.println("DESIGNATION=" + rs.getString(3));
       System.out.println("SALARY=" + rs.getInt(4));
       System.out.println();
    }
		
    rs.close();
    st.close();
    con.close();
  }
  catch(Exception e)
   {
      System.out.println(e);
    }
  }
}






