//Program to demonstrate iterator

import java.util.*;
public class Set2
{
	public static void main(String args[])
	{
		Subscriber s1=new Subscriber(666677,"Anil");
		Subscriber s2=new Subscriber(777788,"Sunil");
		Subscriber s3=new Subscriber(888899,"Chandu");
		Subscriber s4=new Subscriber(999966,"Dolly");
		
		Set<Subscriber> ws=new HashSet<Subscriber>();
		ws.add(s1);
		ws.add(s2);
		ws.add(s3);
		ws.add(s4);
		System.out.println(ws);
		
		for(Subscriber s:ws)
		{
			s.phno=Integer.parseInt("91"+s.phno);//"91666677"
			System.out.println(s);
			/*if(s.sname.equals("Chandu"))
				ws.remove(s);
			System.out.println(s);*/
		}
		
		//Trying to remove items using a for loop or a for-each loop
		//would not work correctly because the collection is changing 
		//size at the same time that the code is trying to loop.
		
		Iterator i=ws.iterator();
		while(i.hasNext())
		{
			Subscriber s=(Subscriber)(i.next());
			//s.phno=Integer.parseInt("91"+s.phno);
			if(s.sname.equals("Chandu"))
			{
				i.remove();
			}
		}
		
		System.out.println();
		System.out.println(ws);
	}
}
	
//Teacher Note: dont override equals() & hashcode() for iterator concept