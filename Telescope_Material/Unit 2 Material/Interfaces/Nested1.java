// Java program to demonstrate working of interface inside a class. (nested interface) 
import java.util.*; 
class Test 
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

class Nested1 
{ 
	public static void main(String[] args) 
	{
		Testing t = new Testing(); 
		Test.Movie obj=t; 
		obj.show(); 
		t.show();
	} 
} 
