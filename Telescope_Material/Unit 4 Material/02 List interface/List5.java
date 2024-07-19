//Java program to sort the elements (String or Wrapper class objects) of List

import java.util.*;  
class List5
{  
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>(); 

		al.add(20);
		al.add(15);
		al.add(58);
		al.add(22);

		/*al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");
		al.add("Tahir");*/
	  
		Collections.sort(al);  
		System.out.println("Ascending order:\n"+al);
		
		Collections.sort(al,Collections.reverseOrder()); //Reverse order
		
		System.out.println("Descending order:\n"+al); 

		System.out.println("Frequency of the word:"+Collections.frequency(al,"Tahir"));
	}  
}  