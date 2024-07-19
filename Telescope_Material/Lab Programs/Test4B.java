/*
Given two strings s1 and s2, your task is to merge those strings to form a new merged string. 
A merge operation on two strings is described as follows:
Append alternating characters from s1 and s2, respectively, to mergedString. 
Once all of the characters in one of the strings have been merged, 
append the remaining characters in the other string to mergedString.

Sample:

input=
hello                                                                                                                   
world                                                                                                                   

output=
hweolrllod

*/
import java.io.*;
import java.util.*;
class Test4B
{
	public static String mergeAlternately(String word1, String word2) 
	{
		StringBuilder sb = new StringBuilder();
		int index1 = 0, index2 = 0;
		while (index1 < word1.length() && index2 < word2.length()) 
		{
			sb.append(word1.charAt(index1));
			sb.append(word2.charAt(index2));
			index1++;
			index2++;
		}
		while (index1 < word1.length()) 
		{
			sb.append(word1.charAt(index1));
			index1++; 
		}
		while (index2 < word2.length()) 
		{
			sb.append(word2.charAt(index2));
			index2++;
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(mergeAlternately(sc.next(),sc.next()));
	}
}
/*
case=1
input=hello                                                                                                                   
world                                                                                                                   
output=
hweolrllod

case=2
input=home                                                                                                                     
is                                                                                                                      
output=
hiosme

case=3
input=bindu                                                                                                                   
nikitha                                                                                                                 
output=
bniinkdiutha
*/