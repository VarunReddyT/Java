//No Duplicate Key on HashMap

import java.util.*;  
public class Demo16
{  
 public static void main(String args[])
 {  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap     
   map.put(16,"Apple");  //Put elements in Map 
   map.put(1,"Mango");    
   map.put(5,"Banana");   
   map.put(1,"Grapes"); //trying duplicate key  
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet())
   {    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  