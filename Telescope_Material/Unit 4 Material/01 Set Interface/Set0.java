//Program to demonstrate creation of HashSet Collection & its methods

import java.util.*;
public class Set0
{
	public static void main(String args[])
	{
		/*Set<String> ws=new HashSet<>();//capacity=16, load factor=0.75;
		//Integer i=new Integer(10);
		ws.add("Ram");
		ws.add("Hima");
		ws.add("Nikitha");
		System.out.println("String Hash Set");
		System.out.println(ws);
		
		System.out.println(ws.add("Ram"));
		System.out.println(ws.add("Bindu"));
		System.out.println(ws);
		System.out.println(ws.remove("Ram"));
		System.out.println(ws);
		System.out.println("Size of hashset "+ws.size());
		System.out.println("Hashset contains Bindu "+ws.contains("Bindu"));
		System.out.println("Is hashset empty? "+ws.isEmpty());*/
		//Integer i=new Integer(10);
		//int x=i;
		Set<Integer> ws1=new HashSet<>();
		ws1.add(10);
		ws1.add(25);
		ws1.add(42);
		ws1.add(28);
		ws1.add(98);
		ws1.add("Ram");
		System.out.println("Integer Hash Set 1");
		System.out.println(ws1);
				
		
		Set<Integer> ws2=new HashSet<Integer>();
		ws2.add(15);
		ws2.add(35);
		ws2.add(42);
		ws2.add(28);
		ws2.add(91);
		System.out.println("\nInteger Hash Set2");
		System.out.println(ws2);
		
		//ws1.addAll(ws2);  //union operation of 2 sets
		//System.out.println("\nws2 added to ws1 "+ws1);
		
		//ws1.retainAll(ws2); 	//Intersection of 2 sets
		//System.out.println("\nIntersection "+ws1);
		
		//ws1.removeAll(ws2); 	//set1-set2
		//System.out.println("\nws1-ws2 "+ws1);
		
		System.out.println("Is ws2 subset of ws1 "+ws1.containsAll(ws2));//Is set2 subset of set1
	}
}
	
