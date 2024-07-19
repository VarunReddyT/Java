/* 10. b. Demonstrate a JDBC program to display all the employee names in ascending order who are working in 
"Dallas" location using createStatement() 

Schema Given below 
emp schema;
+-----------+---------------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-----------+---------------+------+-----+---------+-------+
| empno | int(4) | NO | PRI | NULL | |
| ename | varchar(50) | NO | | NULL | |
| job | varchar(50) | NO | | NULL | |
| mgr | int(4) | YES | | NULL | |
| hiredate | date | YES | | NULL | |
| sal | decimal(10,2) | YES | | NULL | |
| comm | decimal(10,2) | YES | | NULL | |
| deptno | int(2) | YES | MUL | NULL | |
+----------+---------------+------+-----+---------+-------+
dept schema 
+----------+-------------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| deptno | int(2) | NO | PRI | NULL | |
| dname | varchar(50) | NO | | NULL | |
| location | varchar(50) | NO | | NULL | |
+----------+-------------+------+-----+---------+-------+


Sample Database :
mysql> select * from emp;
+-------+-----------+---------------+------+------------+----------+---------+--------+
| empno | ename     | job           | mgr  | hiredate   | sal      | comm    | deptno |
+-------+-----------+---------------+------+------------+----------+---------+--------+
|   401 | Albert    | Sr. Developer | 4001 | 2019-07-01 | 35000.00 | 3000.00 |      4 |
|   402 | Robert    | Data Analyst  | 4002 | 2019-08-01 | 30000.00 | 2000.00 |      4 |
|   403 | Suresh    | Developer     | 1002 | 2019-09-01 | 24000.00 | 2000.00 |      4 |
|   501 | Nitesh    | Developer     | 1001 | 2019-08-01 | 25000.00 | 2000.00 |      5 |
|   502 | Mahesh    | Developer     | 1001 | 2019-09-01 | 24000.00 | 2000.00 |      5 |
|   503 | Akhilesh  | Sr. Developer | 1002 | 2019-08-01 | 45000.00 | 4000.00 |      5 |
|  1201 | Venkatesh | Sr. Developer |  101 | 2019-07-01 | 35000.00 | 3000.00 |     12 |
|  1202 | Harish    | Data Analyst  |  102 | 2019-08-01 | 30000.00 | 2000.00 |     12 |
+-------+-----------+---------------+------+------------+----------+---------+--------+
8 rows in set (0.00 sec)

mysql> select * from dept;
+--------+-------+----------+
| deptno | dname | location |
+--------+-------+----------+
|      4 | ECE   | Collin   |
|      5 | CSE   | Dallas   |
|     12 | IT    | Denton   |
+--------+-------+----------+
3 rows in set (0.00 sec)


*/

import java.sql.*;
class Test10B
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			Statement stmt=con.createStatement();
			String location = "Dallas";
			String sql = "select ename from emp e, dept d  where  e.deptno=d.deptno and location = 'Dallas'";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("\nEmployee Names:");
			while (rs.next()) 
			{
				System.out.println(rs.getString(1));
			}	
			con.close();
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
	}
}


/* 
Sample Output :
Employee Names:
Nitesh
Mahesh
Akhilesh

*/