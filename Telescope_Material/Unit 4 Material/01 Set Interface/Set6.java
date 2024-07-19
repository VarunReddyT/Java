/*Program to demonstrate creation of TreeSet Collection 
for subscriber objects with comparable Interface*/

import java.util.*;
public class Set6
{
	public static void main(String args[])
	{
		Subscriber s1=new Subscriber(866677,"Nikitha");
		Subscriber s2=new Subscriber(777788,"Bindu");
		Subscriber s3=new Subscriber(988899,"Hima");
		Subscriber s4=new Subscriber(299966,"Anil");
		
		TreeSet<Subscriber> ws= new TreeSet<Subscriber>();
		ws.add(s1);
		ws.add(s2);
		ws.add(s3);
		ws.add(s4);
		System.out.println(ws);
		
	}
}
	
