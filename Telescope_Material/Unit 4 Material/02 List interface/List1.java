//ArrayList with user defined class-object

import java.util.*;
public class List1
{
	public static void main(String args[])
	{
		List<Subscriber> l1=new ArrayList<Subscriber>();
		
		Subscriber s1=new Subscriber(666677,"Hima Bindu");
		Subscriber s2=new Subscriber(777788,"Nikitha");
		Subscriber s3=new Subscriber(888899,"Swarajya");
		Subscriber s4=new Subscriber(999966,"Keerthi");
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		System.out.println("ArrayList: "+l1);
		
		//List Iterator
		ListIterator li=l1.listIterator();
		System.out.println("Forward ArrayList:");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("\nReverse ArrayList:");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		//To replace an element
		
		/*System.out.println("ArrayList: "+l1);
		Subscriber s6=new Subscriber(789688,"Mounica");
		System.out.println(l1.set(2,s6));
		System.out.println("Updated ArrayList: "+ l1);*/
		
	}
}
	
