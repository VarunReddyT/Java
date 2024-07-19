class Subscriber 
{
	static int name=20;
	int sno;
	int v1=10;
	Subscriber()
	{
		System.out.println("Base class constructor gets called");
	}
	static
	{
		System.out.println("Base class Static block called 1");
	}
	static
	{
		System.out.println("Base class Static block called 2");
	}
	Subscriber(int x)
	{
		sno=x;
		System.out.println("Base class parameterized constructor gets called");
	}
	void makeCall()
	{
		System.out.println("Base class makecall called");
	}
	void receiveCall()
	{
		System.out.println("Base class receivecall called");
	}
}
