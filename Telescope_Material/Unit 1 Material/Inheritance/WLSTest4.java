//Overridding base class method

class WLS extends Subscriber4
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
	void makeCall()	//overriden method
	{
		
		System.out.println("Derived class makecall called");
	}
}
public class WLSTest4
{
	public static void main(String args[])
	{	
		WLS w=new WLS();
		System.out.println();
		w.sendSms();
		w.receiveSms();
		
		System.out.println("\nCalling overridden method");
		w.makeCall();
	}
}