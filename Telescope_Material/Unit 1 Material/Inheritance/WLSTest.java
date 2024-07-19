class WLS extends Subscriber
{
	int sno=10;
	String name="10";
	int v1=20;
	WLS()
	{
		System.out.println("Derived class constructor gets called");
		/*System.out.println("Subcriber v1 "+super.v1);
		Person p=this;
		System.out.println("Person v1 "+p.v1);*/
	}
	static
	{
		System.out.println("Derived class Static block called");
	}
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
	void makeCall()
	{
		//super.makeCall();
		System.out.println("Derived class makecall called");
	}
}
public class WLSTest
{
	public static void main(String args[])
	{	
		WLS w=new WLS();
		System.out.println("WLS v1 "+w.v1);
		System.out.println();
		w.sendSms();
		w.receiveSms();
		
		System.out.println();
		w.makeCall();
		w.receiveCall();
		
		
		/*Subscriber s=new WLS();
		System.out.println(s.name);
		
		s.makeCall();*/
		//s.sendSms();
		
	}
}