class Sample1
{	
	Sample1()
	{
		System.out.println("Parent Constructor");
	}
	static
	{
		System.out.println("Parent Static Block1");
	}
	{
		System.out.println("Parent Instance Block1");	
	}

}
class Sample2 extends Sample1
{
	Sample2()
	{
		System.out.println("child Constructor");
	}

	static 
	{
		System.out.println("Child Static Block1");
	}
	{
		System.out.println("Child Instance Block1");	
	}

}
class SampleTest
{
	public static void main(String args[])
	{
		System.out.println("From Main");
		Sample2 s=new Sample2();
	}
}