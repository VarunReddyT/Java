class Student
{
	int sno;
	String sname;
	Student()
	{
		sno=101;
		sname="ravi";
	}
}
class Object_class
{
	public static void main(String [] args)
	{
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3=s1;
	int arr[]=new int[10];

	String str="hello";
	//Below two statements are equivalent
	System.out.println(s1);
	System.out.println(s1.toString());
	System.out.println(arr);
	System.out.println(str);
	
	System.out.println("Class Name = "+s1.getClass().getName());
	System.out.println("Hash code of s1= "+s1.hashCode());
	System.out.println("Hash code of s2= "+s2.hashCode());
	System.out.println("Hash code of s3= "+s3.hashCode());

	System.out.println("s1 equals() s2? "+s1.equals(s2));
	System.out.println("s1 equals() s3? "+s1.equals(s3));
	
	}
}