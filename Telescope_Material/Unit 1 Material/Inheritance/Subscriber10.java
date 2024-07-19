class Subscriber10
{
	
	Subscriber10()
	{
		System.out.println("Base class default constructor gets called");
	}
	Subscriber10(int x)
	{
		this();
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
