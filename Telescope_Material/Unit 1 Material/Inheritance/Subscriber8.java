abstract class Subscriber8
{
	Subscriber8()
	{
		System.out.println("Base class constructor gets called");
	}
	abstract void makeCall();
	
	void receiveCall()
	{
		System.out.println("Base class receivecall called");
	}
}
