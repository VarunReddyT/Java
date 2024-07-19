//Base class reference can be used to point to a derived class object
//overridding instance variables (multi level inheritance)

class WLS extends Subscriber9
{
	int v=20;
	int v2=40;
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
		System.out.println(super.v);
		System.out.println("Derived class receiveSms called");
	}
	
}
public class WLSTest9
{
	public static void main(String args[])
	{	
		Subscriber9 s=new WLS();
		System.out.println("value of v="+s.v);
		System.out.println("value of v2="+s.v2);
		
		WLS w=new WLS();
		w.receiveSms();
		
		/*Person p=new WLS();
		System.out.println("value of v using p="+p.v);*/
	}
}