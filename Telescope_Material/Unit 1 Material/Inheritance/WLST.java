//Base class reference can be used to point to a derived class object
//final method and final class

class WLS extends Sub
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
		super.makeCall();
		System.out.println("Derived class makecall called");
	}
	
}
public class WLST
{
	public static void main(String args[])
	{	
		Sub s=new WLS();
		s.makeCall();
		/*Person p=new WLS();
		p.makeCall();*/
	}
}