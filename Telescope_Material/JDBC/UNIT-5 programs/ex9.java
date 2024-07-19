 import java.sql.*;  
class ex9
{  
	public static void main(String args[])throws Exception
	{  
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kmit","root","root");
		//Statement st=con.createStatement();

		con.setAutoCommit(false);  
  
		Statement stmt=con.createStatement();  
		stmt.executeUpdate("insert into login values('Shiva',2100)"); 
		Savepoint savepoint = con.setSavepoint();		
		stmt.executeUpdate("insert into login values('Madhu',5640)"); 
		con.rollback(savepoint);
		stmt.executeUpdate("insert into login values('Sruthi',8976)");
		con.commit();  

		con.close();  
	
	}
}  