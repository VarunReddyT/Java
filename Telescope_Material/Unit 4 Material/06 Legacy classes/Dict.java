// Java Program to explain util.Dictionary class Methods 

import java.util.*; 
public class Dict 
{ 
	public static void main(String[] args) 
	{ 
		// Initializing a Dictionary 
		Dictionary dict = new Hashtable(); 
		
		// put() method 
		dict.put("101", "Nikitha"); 
		dict.put("102", "Bindu"); 
		
		// elements() method : 
		Enumeration i = dict.elements();
		while( i.hasMoreElements()) 
		{ 
			System.out.println("Value in Dictionary : " + i.nextElement()); 
		} 
		
		// get() method : 
		System.out.println("Value at key 101 : " + dict.get("101")); 
		System.out.println("Value at key 104 : " + dict.get("104")); 
		
		// isEmpty() method : 
		System.out.println("\nThere is no key-value pair : " + dict.isEmpty() + "\n"); 
		
		// keys() method : 
		Enumeration k = dict.keys();
		while ( k.hasMoreElements()) 
		{ 
			System.out.println("Keys in Dictionary : " + k.nextElement()); 
		} 
		// remove() method : 
		System.out.println("\nRemove : " + dict.remove("102")); 
		System.out.println("Check the value of removed key : " + dict.get("102")); 
		System.out.println("\nSize of Dictionary : " + dict.size()); 
	} 
} 
