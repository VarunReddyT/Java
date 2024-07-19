/*Program to demonstrate creation of TreeSet Collection 
for subscriber objects with comparator Interface*/

import java.util.*;
public class Set7
{
	public static void main(String args[])
	{
		Subscriber s1=new Subscriber(866677,"Nikitha");
		Subscriber s2=new Subscriber(777788,"Bindu");
		Subscriber s3=new Subscriber(988899,"Hima");
		Subscriber s4=new Subscriber(299966,"Anil");
		
		PhnoComparator pc=new PhnoComparator();
		
		TreeSet<Subscriber> ts1=new TreeSet<Subscriber>(pc);
		ts1.add(s1);
		ts1.add(s2);	
		ts1.add(s3);
		ts1.add(s4);
		System.out.println(ts1);
		
	}
}
	
