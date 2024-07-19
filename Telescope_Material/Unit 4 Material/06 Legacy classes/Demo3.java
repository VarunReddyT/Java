// Stack
/*
Stack is a subclass of Vector that implements a standard last-in, 
first-out stack.

With the release of JDK 5, Stack was retrofitted for generics */

import java.util.*;

class Demo3 
{
public static void main(String args[]) 
  {
	Stack<Integer> st = new Stack<Integer>();

	st.push(30);
	st.push(20);
	st.push(10);
	System.out.println(st);

	st.pop();
	System.out.println(st);//30 20
	System.out.println(st.peek());
	System.out.println(st.search(30)); // Returns the position if the element found otherwise returns -1 
	Enumeration enum2 = st.elements();  
	while(enum2.hasMoreElements()) 
	{ 
		System.out.print(enum2.nextElement()+" ");  
	}
 }
}
