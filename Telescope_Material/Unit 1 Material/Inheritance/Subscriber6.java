class Subscriber6
{
	Subscriber6()
	{
		System.out.println("Base class constructor gets called");
	}
	static
	{
		System.out.println("Base class Static block called");
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
