class Subscriber
{
	int age;
	String name;
	long mdn;

	Subscriber()
	{
		age=25;
		name="Smitha";
		mdn=1234567890L;
	}
	Subscriber(int a, String n, long num)
	{
		age=a;
		name=n;
		mdn=num;
	}
	void makeCall(String s)
	{
		System.out.println(name+" Made a call to "+s);
	}
	void receiveCall(String s)
	{
		System.out.println(name+" Received a call from "+s);
	}
}