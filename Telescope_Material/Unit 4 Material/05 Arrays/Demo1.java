// Java program to demonstrate Arrays.asList() method

import java.util.*;

public class Demo1 
{
	public static void main(String[] args)
	{

		// Get the Array
		Integer arr[] = { 10, 20, 15, 22, 35 };
		List<Integer> list = Arrays.asList(arr);
		
		// To convert the elements as List
		System.out.println("Integer Array as List: " + list);
		
		list.set(1,50);
		arr[4] = 100;
		list.add(120);	//fixed size list
		System.out.println("Updated List: " + list);
		
	}
}
