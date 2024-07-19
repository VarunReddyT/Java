class Subscriber9 extends Person
{
	int v=10;
	String v2="cse";
	Subscriber9()
	{
		System.out.println("Base class constructor gets called");
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
