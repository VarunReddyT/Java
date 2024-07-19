 // Demonstrate various Vector operations.
import java.util.*;

class Demo2 
{
public static void main(String args[]) 
{
	Vector<Integer> v = new Vector<Integer>();

	v.addElement(5);
	v.addElement(6);
	v.add(7);
	v.add(8);

	// Enumerate the elements in the vector.

	Enumeration<Integer> e = v.elements();
	int index=0;
	while(e.hasMoreElements())
	 {
		Integer x=e.nextElement();
		x=x+2;
		v.set(index,x);
		index++;
	 }
	System.out.println(v);
	System.out.println(v.get(0));
}
}
