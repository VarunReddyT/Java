//to pass runtime parameters to the SQL Query.
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ex2 
 {
public static void main(String args[]) throws Exception 
{
   Connection con;
   PreparedStatement st;

   Scanner sc=new Scanner(System.in);		

    System.out.println("Enter Employee No.");
    int x=sc.nextInt();
    sc.nextLine();

    System.out.println("Enter Employee Name");
    String y=sc.nextLine();

    System.out.println("Enter Employee Designation");
    String z=sc.nextLine();

    System.out.println("Enter Employee Salary");
    int sal=sc.nextInt();
		
    try
    {
       //DriverManager.registerDriver( new com.mysql.jdbc.Driver());
		
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
		
        System.out.println("connected");
		
        st=con.prepareStatement("insert into Employee values(?,?,?,?)");
		
        st.setInt(1,x);
        st.setString(2,y);
        st.setString(3,z);
		st.setInt(4,sal);
		
        int i=st.executeUpdate();
		
        System.out.println("no.of records inserted="+i);
		
        st.close();
        con.close();
      }
      catch(Exception e)
      {
           System.out.println(e);
      }
   }
}








