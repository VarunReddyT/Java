// ResultSet Meta Data

import java.sql.*;
import java.util.Properties;

class MetaData
{
 public static void main(String args[])
  throws SQLException
 {
  Properties p=new Properties();
  p.put("host","room1");
  p.put("db","orcl");
  p.put("user","Scott");
  p.put("password","tiger");

  Connection con=DBConnect.getThinConnection(p);

  Statement st=con.createStatement();

  ResultSet rs=st.executeQuery("select * from emp");

  ResultSetMetaData rmd=rs.getMetaData();

  int cols=rmd.getColumnCount();

  System.out.println("No. of Fields:"+cols+"\n");

  for(int i=1;i<=cols;i++)
  {
   System.out.println(rmd.getColumnName(i)+"\t"+rmd.getColumnTypeName(i));
  }
  con.close();
 }
}