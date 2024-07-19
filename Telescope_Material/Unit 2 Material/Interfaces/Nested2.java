// Java program to demonstrate working of interface inside another interface. (nested interface)
import java.util.*; 
interface Test 
{ 
	protected interface Movie 
	{ 
		void show();	 
	} 
} 
class Testing implements Test.Movie 
{ 
	public void show() 
	{ 
		System.out.println("show method of interface"); 
	} 
} 
class Nested2 
{ 
	public static void main(String[] args) 
	{ 
		Testing t = new Testing(); 
		Test.Movie obj = t; 
		obj.show(); 
	} 
} 
