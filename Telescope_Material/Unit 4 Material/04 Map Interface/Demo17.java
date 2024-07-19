// different ways to insert elements.

import java.util.*;  
class Demo17
{  
 public static void main(String args[])
 {  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul"); 
      hm.put(103, "Hello");    
      
      System.out.println(hm);    
      System.out.println();
	  
      hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      System.out.println(hm);
      System.out.println();
	  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(104,"Ravi");  
      map.putAll(hm);  
      
      System.out.println("After invoking putAll() method ");  
      System.out.println(map);  
 }  
}  
