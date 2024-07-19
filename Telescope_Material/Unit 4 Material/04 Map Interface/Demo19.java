//different ways to replace elements.

import java.util.*;  
class Demo19
{  
 public static void main(String args[])
 {  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
      System.out.println("Initial list of elements:");  
     System.out.println(hm);
	 
     System.out.println("Updated list of elements:");  
     hm.replace(102, "Gaurav");  
     System.out.println(hm);
	 
     System.out.println("Updated list of elements:");  
     hm.replace(101, "Vijay", "Ravi");  
     System.out.println(hm);
	 
     System.out.println("Updated list of elements:");  
     hm.replaceAll((k,v) -> "Ajay");  
     System.out.println(hm);  
 }  
}  