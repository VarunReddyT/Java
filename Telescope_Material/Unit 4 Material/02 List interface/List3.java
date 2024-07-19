//Queue operations in LinkedList
import java.util.*;

class List3
{
	public static void main(String args[]) 
	{
		LinkedList<String> list = new LinkedList<String>();

		list.offer("C");
		list.offer("D");
		list.offer("E");
		System.out.println(list);// 

		list.offerFirst("B");
		//list.addFirst("")
		list.offerLast("F");
		//list.addLast("")
		System.out.println(list);//
		
		System.out.println(list.peekFirst());//
		//System.out.println(list.getFirst());

		System.out.println(list.peekLast());//
		//System.out.println(list.getLast());

		list.pollFirst(); //deletes 
		//list.removeFirst();

		list.pollLast();// deletes 
		//list.removeLast();
		System.out.println(list);//

	}
}

