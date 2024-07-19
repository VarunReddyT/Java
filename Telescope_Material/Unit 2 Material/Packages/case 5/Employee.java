package pack1.telecom;
public class Employee
{
	int empid;
	String ename;
	public Employee(int eid, String name)
	{
		empid=eid;
		ename=name;
		System.out.println("empid is:"+ empid);
		System.out.println("ename is:"+ ename);
	}
	public static void tele()
	{
		System.out.println("TATA Telecom");
	}
}

/*package pack2.MNC;
public class Employee
{
	int empid;
	String ename;
	int experience;
	public Employee(int eid, String name, int exp)
	{
		empid=eid;
		ename=name;
		experience=exp;
		System.out.println("empid is:"+ empid);
		System.out.println("ename is :"+ ename);
		System.out.println("experience is:"+ experience);
	}
	public void org()
	{
		System.out.println("MicroSoft");
	}
}*/