class SampleInit
{
	private int a;
	String name;
	void display()
	{
		System.out.println("a="+a);
		System.out.println("Name="+name);
	}
}
class InitTest
{
	public static void main(String args[])
	{
		SampleInit s=new SampleInit();
		s.a=10;
		s.name="Bindu";
		s.display();
	}
}