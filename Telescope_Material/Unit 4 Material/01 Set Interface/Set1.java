 //Program to demonstrate creation of HashSet Collection

import java.util.*;
public class Set1
{
	public static void main(String args[])
	{
		Subscriber s1=new Subscriber(666677,"Smitha");
		Subscriber s2=new Subscriber(777788,"Ram");
		Subscriber s3=new Subscriber(888899,"Ravi");
		Subscriber s4=new Subscriber(999966,"Charan");
		
		Set<Subscriber> ws=new HashSet<Subscriber>();
		ws.add(s1);
		ws.add(s2);
		ws.add(s3);
		ws.add(s4);
		ws.add(s1);
		System.out.println(ws);
		
		Subscriber s5=new Subscriber(666677,"Smitha");
		ws.add(s5);
		System.out.println(ws);
		
		
		s2.sname="Suma";
		System.out.println(ws);
		
	}
}
	
