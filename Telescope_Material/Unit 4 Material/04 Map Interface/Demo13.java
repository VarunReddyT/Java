// Create a Hashmap , Add elements to the map ,Display the elements of map, Update the element using get().

import java.util.*;

class Demo13 
{
public static void main(String args[])
 {
// Create a hash map.
HashMap<String, Integer> hm = new HashMap<String, Integer>();

// Put elements to the map
hm.put("bhaskar", 55000);
hm.put("shiva", 65000);
hm.put("anil", 30000);
hm.put("younus", 47000);


System.out.println(hm);

// update anil salary by adding 5000
int sal = hm.get("anil");

hm.put("anil",sal+5000);

System.out.println("anil salary after updation: ");
System.out.println(hm);
}
}
