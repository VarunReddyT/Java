// Vector class
/*
Vector implements a dynamic array. 

It is similar to ArrayList, but with two differences: 

1)Vector is synchronized

2)It contains many legacy methods that duplicate the 
functionality of methods defined by the Collections Framework.

With the advent of collections, Vector was reengineered
to extend AbstractList and to implement the List interface. 

With the release of JDK 5, it was retrofitted for generics */


import java.util.*;

class Demo1 
{
public static void main(String args[]) 
{
	Vector<Integer> v = new Vector<Integer>(3,2); //constructor with capacity and incrementor

	System.out.println(v.size());
	System.out.println(v.capacity());

	v.addElement(5);
	v.add(6);
	v.add(0,4);
	System.out.println(v);
	System.out.println(v.capacity());

	v.addElement(7);
	System.out.println(v);
	System.out.println(v.capacity());

	System.out.println(v.firstElement());
	System.out.println(v.lastElement());

	if(v.contains(7))
		System.out.println("Vector contains 7");
}
}
