class Sample3 extends Sample2
{
	static int x=10;
	int j=10;
	Sample3()
	{
		System.out.println("From constructor");
	}
	static
	{
		System.out.println("In Static block");
		System.out.println("static block x="+x);

	}
	{
		System.out.println("From instance block");
		System.out.println("Instance block x="+x);
	}
			
    	
}
class Sample1
{
	public static void main(String args[])
	{
		System.out.println("In main method");
		//Sample3 s=new Sample3();
		
	}
}
class Sample2
{
	static
	{
		System.out.println("Parent's Static block");
	}
	{
		System.out.println("Parent's instance block");
	}
	Sample2()
	{
		System.out.println("Parent's Constructor");
	}
}



		