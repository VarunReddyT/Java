  // Demonstrate a Property list.

/*
Properties is a subclass of Hashtable.

for each entry, key is a String and the value is also a String. 

The Properties class is used by some other Java
classes.

example:
-------- 
System.getProperties( )

returns environmental values.*/

import java.util.*;

class Demo5 
{
public static void main(String args[]) 
  {
	Properties p = new Properties();

	p.put("Telangana","Hyderabad");
	p.put("Andhra Pradesh","Amaravathi");
	p.put("Tamilnadu","Chennai");
	p.put("Karnataka","Banglore");

	System.out.println(p);
	System.out.println(p.getProperty("Telangana"));
	System.out.println(p.setProperty("Telangana","HYD"));
	System.out.println(p.getProperty("AP"));

	Set<Object> set_data = p.keySet();      
	for(Object obj: set_data)  
	{  
		  System.out.println(obj+" capital is "+ p.getProperty((String)obj));  
	} 
	Properties p1 = new Properties(p);
	p1.put("Maharastra","Bombay");
	System.out.println(p1);
	System.out.println(p1.getProperty("Telangana"));
	System.out.println(p1.getProperty("AP"));

}
}
