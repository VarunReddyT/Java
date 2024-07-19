/* 9B
When working with HashMaps, sometimes cases arise where we wish to determine if two HashMaps have any key/value pairs in common. For example, we might have the following two Hashmaps (named hashmap1 and hashmap2, respectively) that map from String to String (i.e., their type is HashMap) and we want to count how many key/value pairs they have in common. 
In the example above, these two HashMaps have two key/value pairs in common, namely: "Mary"/"Ecstatic" and "Bob"/"Happy". Note that although the key "Felix" is in both HashMaps, the associated value with this key is different in the two maps (hence this does not count as a key/value pair that is common to both HashMaps). Similarly, just having the same value without the same key (such as the value "Fine" which is mapped to by different keys in the two different HashMaps) would also not count as a common key/value pair between the two HashMaps.
 
Sample IO:
----------
Enter how many pairs in HashMap 1:5
Enter 5 pair of Strings
Alice Healthy
Mary Ecstatic
Bob Happy
Chuck Fine
Felix Sick
Enter how many pairs in HashMap 2:5
Enter 5 pair of Strings
Mary Ecstatic
Felix Healthy
Ricardo Superb
Tam Fine
Bob Happy
Common number of key/value pairs are: 2

*/

import java.util.*;
class Test9B
{
	public static int commonKeyValuePairs(HashMap<String,String> map1,HashMap<String,String> map2)
	{
		int count = 0;
		for(Map.Entry m1:map1.entrySet())
		{
            for(Map.Entry m2:map2.entrySet())
			{
                if(m1.getKey().equals(m2.getKey()) && m1.getValue().equals(m2.getValue()))
				{
                    count++;
                }
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		System.out.print("Enter how many pairs in HashMap 1:");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter " + n1 + " pair of Strings");
		for(int i = 0; i < n1; i++)
		{
			String pairs[] = sc.nextLine().split(" ");
			map1.put(pairs[0],pairs[1]);
		}
		
		System.out.print("Enter how many pairs in HashMap 2:");
		int n2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter " + n2 + " pair of Strings");
		for(int i = 0; i < n2; i++)
		{
			String pairs[] = sc.nextLine().split(" ");
			map2.put(pairs[0],pairs[1]);
		}
		
		int count = commonKeyValuePairs(map1,map2);
		System.out.println("Common number of key/value pairs are: " + count);
	}
}

/*test casescase=1
input=5
Alice Healthy
Mary Ecstatic
Bob Happy
Chuck Fine
Felix Sick
5
Mary Ecstatic
Felix Healthy
Ricardo Superb
Tam Fine
Bob Happy
output=
Enter how many pairs in HashMap 1:
Enter 5 pair of Strings

Enter how many pairs in HashMap 2:
Enter 5 pair of Strings

Common number of key/value pairs are: 2

case=2
input=3
jim jam           
king kong         
bob alice         
4
jam jam           
bob alice         
tom jerry         
king kong         
output=
Enter how many pairs in HashMap 1: 
Enter 3 pair of Strings  

Enter how many pairs in HashMap 2: 
Enter 4 pair of Strings   

Common number of key/value pairs are: 2 
*/


