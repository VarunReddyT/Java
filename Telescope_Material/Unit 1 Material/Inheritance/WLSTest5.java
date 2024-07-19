//Overridding base class static method

class WLS extends Subscriber5
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
	static void makeCall() 
	{
		System.out.println("Derived class makecall called");
	}
}
public class WLSTest5
{
	public static void main(String args[])
	{	
		
		WLS w=new WLS();
		System.out.println();
		
		System.out.println("\nCalling overridden static method");
		w.makeCall();
	}
}