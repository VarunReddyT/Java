import java.sql.*;
import java.util.Properties;

class Transaction 
{
 public static void main(String args[])
  throws SQLException
 {
  Driver d=new oracle.jdbc.driver.OracleDriver();

  Properties p=new Properties();
  p.put("user","scott");
  p.put("password","tiger");

  Connection con=d.connect("jdbc:oracle:thin:@room1:1521:orcl",p);

  Statement st=con.createStatement();

  st.addBatch("update accounts set bal=bal-1000 where accno=1001");

//  System.exit(0);

  st.addBatch("update accounts set bal=bal+1000 where accno=1002");

  st.executeBatch();

  con.close();
 }
}