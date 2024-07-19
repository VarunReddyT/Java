//Java program to illustrate methods of PriorityQueue with Wrapper class objects

import java.util.*; 
class PQueue2 
{ 
	public static void main(String args[]) 
	{ 
		// Creating empty priority queue 
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 

		// Adding items to the pQueue using add() 
		pQueue.add(15); 
		pQueue.add(48); 
		pQueue.add(10);
		pQueue.offer(55);
		pQueue.offer(85);
		pQueue.offer(5);
		
		System.out.println(pQueue.peek()); 
		System.out.println(pQueue.element()); 
		System.out.println(pQueue);

		System.out.println(pQueue.poll()); 
		System.out.println(pQueue.remove()); 
		System.out.println(pQueue);
	} 
} 
