class Sample
{
	static int i;
	int j;
	{
		i++;
		j++;
		System.out.println("Instance intializer 1");
		//System.out.println(x+" "+j);
		m1();
		m2();
	}
	static
	{
		//i=10;
		//j=20;
		System.out.println("Static initializer 1");
		//System.out.println(i+" "+k);
		m1();
		//m2();
	}
	Sample()
	{
		System.out.println("Default constructor");
	}
	static void m1()
	{
		//j=10;
		System.out.println("Static method m1 called");
	}
	int x=10;
	{
		System.out.println("Instance intializer 2");
		System.out.println(x+" "+j);
	}
	void m2()
	{
		i=10;
		System.out.println("Method m2 called");
	}
	
	static int k=10;
	static
	{
		System.out.println("static Initializer 2");
		System.out.println(k+" "+i);
		//System.out.println(i);
	}
	
	public static void main(String args[])
	{
		Sample obj1=new Sample();
		System.out.println("In main method");
		//Sample obj2=new Sample(); 
	}
}


 