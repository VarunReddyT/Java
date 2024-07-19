//Constructor Invocation

class WLS extends Subscriber2
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
}
public class WLSTest2
{
	public static void main(String args[])
	{	
		WLS w=new WLS();
	}
}