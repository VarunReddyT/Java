// Java program to demonstrate few functions of ArrayDeque

import java.util.*; 
public class DeQueue 
{ 
	public static void main(String[] args) 
	{ 
		Deque<Integer> de_que = new ArrayDeque<Integer>(); 
		de_que.add(10); 
		de_que.add(20); 
		de_que.add(30); 
		de_que.add(40); 
		de_que.add(50); 
		System.out.println("The array is: "+de_que);
		
		de_que.addFirst(564);  
		de_que.addLast(14); 
		System.out.println("The array is: "+de_que);
		
		de_que.pollFirst(); 
		de_que.pollLast(); 
		System.out.println("The array is: "+de_que);
		 
		System.out.println("Head Element using getFirst(): " + de_que.getFirst()); 
		System.out.println("Last Element using getLast(): " + de_que.getLast()); 
		
		
		// descendingIterator() : to reverse the deque order 
		System.out.println("Elements of deque in reverse order: "); 
		Iterator dItr = de_que.descendingIterator();
		while( dItr.hasNext()) 
		{ 
			System.out.println(dItr.next()); 
		} 
	} 
} 
