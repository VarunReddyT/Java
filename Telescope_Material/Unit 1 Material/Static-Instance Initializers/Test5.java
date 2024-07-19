class Sample
{
	static int i;
	int j;
	
	{
		//i++;
		//j++;
		//System.out.println(l);
		System.out.println("Instance intializer 1");
		//m1();
		//m2();
	}
	static
	{
		//i=10;
		//j=20;
		
		//System.out.println(k);
		System.out.println("Static initializer block");
		//m1();
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
	static int k;
	int l;
	{
		System.out.println("Instance intializer 2");
		//System.out.println(i+" "+j);
	}
	void m2()
	{
		//i=10;
		System.out.println(l);
		System.out.println("Method m2 called");
	}
	static
	{
		System.out.println("static 2");
		System.out.println(k);
		//System.out.println(i);
	}
}

class Test5
{
	static
	{
		System.out.println("Test 5 static");
	}
    public static void main(String args[])
	{
		Sample obj1=new Sample();
		System.out.println("In main method");
		Sample obj2=new Sample();
	}
}
 