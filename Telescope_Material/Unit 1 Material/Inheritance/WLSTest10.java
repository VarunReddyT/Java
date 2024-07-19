//Parameterized constructor using super

class WLS extends Subscriber10
{
	WLS(int x)
	{
		super(x);
		System.out.println("Derived class parameterized constructor gets called");
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
public class WLSTest10
{
	public static void main(String args[])
	{	
		WLS w=new WLS(10);		
	}
}