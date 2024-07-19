//Abstract class

class WLS extends Subscriber
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
		System.out.println("Derived class makeCall called");
	}
	
}
public class WLSTest
{
	public static void main(String args[])
	{	
		//Subscriber obj=new Subscriber();
		Subscriber s=new WLS();
		s.makeCall();
	}
}