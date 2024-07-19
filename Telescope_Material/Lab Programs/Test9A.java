/* 9A
Write a java Program to write a method fCount which takes a string as a parameter. The Method fCount should return the Map which has the frequency count of the given word. 

For example if the string passed is "hello" the map should return {h-1,e-1,l-2,o-1}. 
The order of the characters should be same as in the string.

Sample IO:
----------
Enter a string: hello
{h=1, e=1, l=2, o=1}
*/

import java.util.*;
class Test9A
{
	public static LinkedHashMap<Character, Integer> fCount(String str)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++)
        {
			int c=map.getOrDefault(str.charAt(i),0)+1;
            map.put(str.charAt(i), c);          
        }
		return map;
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		
		Map<Character, Integer> result = fCount(str);
		System.out.println(result);
	}
}

/*test cases:
case=1
input=hello
output=
Enter a string: 
{h=1, e=1, l=2, o=1}

case=2
input=additions
output=
Enter a string:                                                                                                
{a=1, d=2, i=2, t=1, o=1, n=1, s=1}                                                                                     
*/
