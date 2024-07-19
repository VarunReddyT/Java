class Student
{
	int rno;
	String name;
	Student()
	{	
		rno=28;
		name="Siddarth";
	}

	void read()
	{
		System.out.println("A Student can read");
	}
	void write()	
	{
		System.out.println("A Student can write");
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();

		
		System.out.println(s2.rno);
		System.out.println(s2.name);
		s1.read();
		s1.write();
	}
}