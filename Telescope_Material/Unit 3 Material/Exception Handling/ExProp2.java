//Exception propagation
class ExProp2
{
	public static void main(String args[])
	{
		try
		{
			m1();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		System.out.println("Hello world");
	}
	public static void m1()
	{
		m2();
		System.out.println("Method 1");
	}
	public static void m2()
	{
		m3();
		System.out.println("Method 2");
	}
	public static void m3()
	{
		int a=10,b=0;
		int k=a/b;
		System.out.println("Method 3 with an exception");
		System.out.println("Method 3");
	}
}