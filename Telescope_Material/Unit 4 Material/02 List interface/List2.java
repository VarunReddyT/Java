//LinkedList example
import java.util.*;
class List2
{
	public static void main(String args[]) 
	{
		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("B");
		list.offer("C");
		list.offer("D");
		list.add(2,"G");
		list.offer("E");

		System.out.println(list);//
		
		//retreive first element
		System.out.println("Head element :"+list.element()); //raises exception if list is empty
		System.out.println("Head element :"+list.peek());	//returns null if list is empty
		
		//deletes first element
		System.out.println(list.remove()+" Deleted");//raises exception if list is empty
		System.out.println(list.poll()+" Deleted");//returns null if list is empty
		
		System.out.println(list);
	}
}

