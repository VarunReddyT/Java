//java program to demonstrate LinkedHashset using Integer(wrapper class) objects

import java.util.*;
public class Set4
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> ss= new LinkedHashSet<Integer>();
		ss.add(40);
		ss.add(25);
		ss.add(30);
		ss.add(18);	
		ss.add(40);
		System.out.println(ss);
	}
}
	
