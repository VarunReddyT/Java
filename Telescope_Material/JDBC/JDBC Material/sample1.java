import java.sql.*;

class sample1
{
  public static void main(String args[])  throws Exception
  {
     Connection con;
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con=DriverManager.getConnection("jdbc:odbc:mydsn","scott","tiger");


/*
          DriverManager.registerDriver( new com.mysql.jdbc.Driver());

          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");

*/


     System.out.println("connected");
  }
 }
