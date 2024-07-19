import java.util.*;

class Demo12 
{
public static void main(String args[])
{

//HashMap hm=new HashMap();

HashMap<String,Integer> hm = new HashMap<String,Integer>();

// Put elements to the map
hm.put("bhaskar",55000);
hm.put("shiva",65000);
hm.put("anil",35000);
hm.put("younus",47000);
System.out.println(hm);

// Get a set of the entries.
Set< Map.Entry<String,Integer> > s1 = hm.entrySet();

System.out.println(s1);

// Display the set.
for(Map.Entry<String,Integer> e : s1)
  {
	System.out.print(e.getKey() + ": ");
	System.out.println(e.getValue());
  }
}
}
