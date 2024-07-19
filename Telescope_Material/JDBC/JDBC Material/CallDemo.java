// stored procedure

import java.sql.*;

class CallDemo
{
 public static void main(String args[])
  throws SQLException
 {
  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@room1:1521:orcl","scott","tiger");

  CallableStatement cs=con.prepareCall("{call addproc(?,?,?,?)}");
  cs.setInt(1,15);
  cs.setInt(2,14);

  cs.registerOutParameter(3,Types.NUMERIC);
  cs.registerOutParameter(4,Types.NUMERIC);
  cs.execute();

  System.out.println(cs.getInt(3));
  System.out.println(cs.getInt(4));
  con.close();
 }
}