// A simple program to Test Interface default methods & static method in java 
interface TestInterface 
{ 
	// abstract method 
	public void square(int a); 

	// default method with default keyword
	public default void show() 
	{ 
		System.out.println("Default Method Executed"); 
	} 
	// static method
	static void hello()
	{
		System.out.println("Hello, New Static Method Here");
	}
} 

class DefaultClass implements TestInterface 
{
	public void square(int a) 
	{ 
		System.out.println(a*a); 
	} 
	public void show() //overidden
	{ 
		System.out.println("overriden show method"); 
	}
	public static void main(String args[]) 
	{ 
		DefaultClass d = new DefaultClass(); 
		d.square(4); 
		
		TestInterface t=new DefaultClass();
		// default method executed 
		d.show(); 
		t.show();
		//static method
		TestInterface.hello();
		hello();
		
		
	} 
} 
