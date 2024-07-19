/*Java program to illustrate PriorityQueue with 
String objects*/

import java.util.*;  
class PQueue1
{  
	public static void main(String args[])
	{  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.offer("Amit");  
	queue.offer("Vijay");  
	queue.offer("Karan");  
	queue.offer("Jai");  
	queue.offer("Rahul");
	queue.offer("Smitha");	
	
	System.out.println(queue);
	
	
	System.out.println("Removing the queue elements:");  

	while(!queue.isEmpty()) 
	{
   		System.out.println(queue.poll()); //or removeFirst() or remove()
	}
	} 
}  

/*Note: You need to poll the items from the PriorityQueue one by one. toString doesn't do that.
So instead of your System.out.println(queue); do this:

while(!queue.isEmpty()) {
   System.out.println(queue.poll());
}

The reason is that the PriorityQueue is never completely sorted internally, 
Understand how a heap works for more detail. 
Polling items from it fixes the heap during the calls, 
thus it should output the elements in sorted order.
*/