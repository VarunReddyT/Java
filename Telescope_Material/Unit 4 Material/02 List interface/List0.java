//Array List methods
import java.util.*;
class List0
{
	public static void main(String args[]) 
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add(1,"G");
		list.add("D");
		list.add("B");
		
		System.out.println(list);
		System.out.println("Is list empty "+list.isEmpty());
		System.out.println("Size of the list "+list.size());
		System.out.println("Does list contains G "+list.contains("G"));
		System.out.println("First occurence of B "+list.indexOf("B"));
		System.out.println("Last occurence of B "+list.lastIndexOf("B"));
		System.out.println("Value at index 2 "+list.get(2));
		list.set(5,"X");//replace an element
		System.out.println("List after Setting index 5 with X "+list);
		list.remove("G");
		System.out.println("List after deleting G "+list);
		list.remove(2);
		System.out.println("List after deleting value at index 2 "+list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(5);
		list1.add(8);
		list1.add(1);
		list1.add(12);
		list1.add(15);
		System.out.println("Integer list"+list1);
		list1.remove(new Integer(1));
		System.out.println("Updated Integer list"+list1);
	}
}

