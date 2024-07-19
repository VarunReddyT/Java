//Create a TreeMap, Add elements to it and Display them


import java.util.*;


class Demo15 
{
public static void main(String args[])
{

    TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

	// Put elements to the map
	tm.put("bhaskar", 55000);
	tm.put("shiva", 65000);
	tm.put("anil", 35000);
	tm.put("younus", 47000);

	// Get a set of the entries.
	Set<Map.Entry<String,Integer>> s1 = tm.entrySet();

	// Display the set.
	for(Map.Entry<String,Integer> e : s1)
	{
			System.out.println(e.getKey() + ": " + e.getValue());
			
	}

}

}
