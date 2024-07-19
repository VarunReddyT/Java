//import   java.io.*;
import   java.sql.*;

class ex1
{
public static void main(String args[]) //throws Exception
{
   Connection   con;
   Statement    st;
   try
   {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
			
		System.out.println("connected");
			   
		st=con.createStatement();
			
		int i=st.executeUpdate("insert into Employee values(110,'Tom','Asst.Professor',30000)");

		System.out.println("no.of records inserted="+i);
			
		st.close();  
		con.close();
    }
    catch(Exception e)
    {
        System.out.println("Error is: "+e);
    } 

   }
}







