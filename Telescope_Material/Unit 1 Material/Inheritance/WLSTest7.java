//Base class reference can be used to point to a derived class object

class WLS extends Subscriber7
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
	
	void makeCall()	//overridden
	{
		System.out.println("Derived class makecall called");
	}
	
}
public class WLSTest7
{
	public static void main(String args[])
	{	
		Subscriber7 s=new WLS();
		s.makeCall();
		//s.receiveSms();		
	}
}