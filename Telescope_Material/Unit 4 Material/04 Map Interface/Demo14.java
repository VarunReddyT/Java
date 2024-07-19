// Create the LinkedHashMap ,add elements to it and Display the elements.
import java.util.*;

class Demo14 
{
public static void main(String args[])
 {
// Create a hash map.
LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

// Put elements to the map
lhm.put("bhaskar", 55000);
lhm.put("shiva", 65000);
lhm.put("anil", 35000);
lhm.put("younus", 47000);
System.out.println(lhm);

}
}
