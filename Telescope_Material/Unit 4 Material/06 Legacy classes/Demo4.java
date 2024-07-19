 //Hashtable.

/*
concrete implementation of a Dictionary. 

However, with the advent of collections,
 Hashtable was reengineered to also implement
 the Map interface. 

Thus, Hashtable is integrated into the Collection Framework.

It is similar to HashMap, but it is synchronized.
*/

import java.util.*;

class Demo4 
{
public static void main(String args[]) 
 {
Hashtable<String,Integer> ht =new Hashtable<String,Integer>();

ht.put("cseE",75);
ht.put("cseF",70);
ht.put("cseG",50);
ht.put("IT-B",60);

System.out.println(ht);

System.out.println(ht.get("IT-B"));
System.out.println(ht.remove("cseG"));

//System.out.println(ht);

Set<Map.Entry<String,Integer>> dataset = ht.entrySet();  
Iterator itr = dataset.iterator();  
    while(itr.hasNext())  
    {  
      Map.Entry ele=(Map.Entry)itr.next();  
      System.out.println(ele.getKey()+"="+ele.getValue());  
    }  

 }
}
