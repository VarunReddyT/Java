/* Java program to illustrate  Autoboxing */
import java.io.*; 
import java.util.*; 
  
class autoboxing 
{ 
    public static void main (String[] args) 
    { 
        /* Here we are creating a list  of elements of Integer type. 
          adding the int primitives type values */
        ArrayList<Integer> list = new <Integer>ArrayList(); 
		
		//System.out.print(list);
        for (int i = 1; i <=10; i++) 
            list.add(i); //autoboxing
		System.out.print(list);
		
		for(int x:list) //Unboxing
		{
			System.out.print(x+" ");
		}

    } 
} 