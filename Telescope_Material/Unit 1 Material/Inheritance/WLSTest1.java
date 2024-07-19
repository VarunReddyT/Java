//WLS inherits Subscriber class

class WLS extends Subscriber1
{
	String name;
	void sendSms()
	{
		System.out.println("Derived class sendSms called");
	}
	void receiveSms()
	{
		System.out.println("Derived class receiveSms called");
	}
}
public class WLSTest1
{
	public static void main(String args[])
	{	
		WLS w=new WLS();
		w.sendSms();
		w.receiveSms();
		
		System.out.println("\nAccessing Base class methods using Derived class object");
		w.makeCall();
		w.receiveCall();
		w.sno=10;
		w.name="Ravi";
		System.out.println("Subscriber number:"+w.sno);	
		System.out.println("Subscriber name:"+w.name);
	}
}