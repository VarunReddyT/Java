public class Subscriber
{
	int phno;
	String sname;
		
	public Subscriber(int num,String str)
	{
		phno=num;
		sname=str;
	}
	void makeCall()
	{
		System.out.println("Make a call called:");
	}
	void receiveCall()
	{
		System.out.println("Receive call called:");
	}
	public String toString()
	{
		return sname+":"+phno;
	}
}
