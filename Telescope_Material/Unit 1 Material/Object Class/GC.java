class Test10
{  
	int arr[];
	Test10()
	{
		System.out.println("Constructor called");
		arr=new int[10];
	}
	//overiding finalize()
	protected void finalize() 
	{
		System.out.println("object is garbage collected");
	}  
}  
  
public class GC
{  
  
 public static void main(String args[])
 {  
   Test10 obj1=new Test10();
   Test10 obj2=new Test10();
   Test10 obj3=new Test10();
   obj1=null; //By nulling a reference
   obj2=obj3; //By assigning a reference to another:
   new Test10(); //By anonymous object 
   System.gc();  
 }  
} 