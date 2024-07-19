//Program to convert Collection to an array

import java.util.*;
public class Set3
{
	public static void main(String args[])
	{
		Subscriber s1=new Subscriber(666677,"Anil");
		Subscriber s2=new Subscriber(777788,"Bhavya");
		Subscriber s3=new Subscriber(888899,"Chandu");
		Subscriber s4=new Subscriber(999966,"Dolly");
		
		Set<Subscriber> set2=new HashSet<Subscriber>();
		set2.add(s1);
		set2.add(s2);
		set2.add(s3);
		set2.add(s4);
		
		//toArray()
		System.out.println("Set2 converted to array:");
		
		Object arr[]=set2.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			Subscriber s=(Subscriber)arr[i];
			System.out.println(s);
		}
	}
}
	
