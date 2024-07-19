package telecom;

public class Employee
{
	int empid;
	String ename;
	public Employee(int eid, String name)
	{
		empid=eid;
		ename=name;
		System.out.println("empid is:"+ empid);
		System.out.println("ename is :"+ ename);
	}
	public void display()
	{
		System.out.println("Employee Display");

	}
} 