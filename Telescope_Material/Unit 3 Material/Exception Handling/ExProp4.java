//Exception propagation compile time exception (checked exception)
import java.io.*;
class ExProp4
{
	public static void main(String args[])
	{
		try
		{
			m1();
		}
		catch(FileNotFoundException ie)
		{
			System.out.println(ie.getMessage());
		}
		
		System.out.println("Hello world");
	}
	public static void m1() throws FileNotFoundException
	{
		m2();
		System.out.println("Method 1");
	}
	public static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("Method 2");
	}
	public static void m3() throws FileNotFoundException
	{
		int a=10,b=2;
		int k=a/b;
		FileInputStream fis=new FileInputStream("demo100.java");
		System.out.println("File opened sucessfully");
		System.out.println("Method 3");	
	}
}