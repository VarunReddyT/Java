public class Subscriber implements Comparable<Subscriber> //for Set6.java
{
	int phno;
	String sname;
	public Subscriber(int num,String str)
	{
		phno=num;
		sname=str;
	}
	
	public String toString()
	{
		return sname+":"+phno;
	}
		
	//Set1.java only
	/*public boolean equals(Object o)
	{
		Subscriber s = (Subscriber)o;
		return (phno==s.phno && sname.equals(s.sname));
	}
	public int hashCode()
	{
		return phno;
	}*/
	
	public int compareTo(Subscriber s)
	{
			return sname.compareTo(s.sname);
	}
}
