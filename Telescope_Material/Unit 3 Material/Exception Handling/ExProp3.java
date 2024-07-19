//Exception propagation compile time exception (checked exception)
import java.io.*;
class ExProp3
{
	public static void main(String args[]) 
	{
		m1();
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
		int a=10,b=2;
		int k=a/b;
		try{
			FileInputStream fis=new FileInputStream("ex1.dat");
			System.out.println("File opened sucessfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Method 3 with an exception");
	}
}