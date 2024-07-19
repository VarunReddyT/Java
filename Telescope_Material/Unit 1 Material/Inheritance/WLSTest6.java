//Introducing static blocks 

class WLS extends Subscriber6
{
	WLS()
	{
		System.out.println("Derived class constructor gets called");
	}
	static
	{
		System.out.println("Derived class Static block called");
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
public class WLSTest6
{
	public static void main(String args[])
	{	
		System.out.println("From main");
		WLS w=new WLS();
	}
}