class Sub extends Person
{
	Sub()
	{
		System.out.println("Base class constructor gets called");
	}
	void makeCall()
	{
		super.makeCall();
		System.out.println("Base class makecall called");
	}
	void receiveCall()
	{
		System.out.println("Base class receivecall called");
	}
}
