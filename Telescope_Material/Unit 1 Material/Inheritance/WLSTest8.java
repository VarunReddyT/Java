//Base class reference can be used to point to a derived class object


class WLS extends Subscriber8
{
	WLS()
	{
		System.out.println("Derived class constructor gets called");
	}
	void sendSms()
	{
		System.out.println("Derived class sendSms called");
	}
	void receiveSms()
	{
		System.out.println("Derived class receiveSms called");
	}
	void makeCall()
	{
		System.out.println("Derived class makecall called");
	}
	
}
public class WLSTest8
{
	public static void main(String args[])
	{	
		//Subscriber8 s1=new Subscriber8();
		Subscriber8 s=new WLS();
		s.makeCall();
	}
}