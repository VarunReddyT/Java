import java.sql.*;

class sample8
{
  public static void main(String args[])  throws Exception
  {
     Connection con;
     CallableStatement cst;
    

     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con=DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

     cst=con.prepareCall("{call myproc1(?,?)}");
     cst.setInt(1,333);
     cst.setString(2,"ravi");
     cst.execute();

     System.out.println("stored procedure invoked");
     con.close();
 
  }
}
