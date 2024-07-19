/*Given two strings text1 and text2, return the length of their longest common subsequence. 
A subsequence of a string is a new string generated from the original string with some characters 
(can be none) deleted without changing the relative order of the remaining characters. 
(eg, "ace" is a subsequence of "abcde" while "aec" is not). 
A common subsequence of two strings is a subsequence that is common to both strings. 
If there is no common subsequence, return 0.

Sample 1:
input=
abcdef
agcdk                                              

output=
3                      

Explanation: "acd" is the longest common subsequence 
*/
import java.util.Scanner;
class Test4A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i=0,j=0,k=0,c=0;
		for(i=0;i<s1.length();i++)
		{
			for(j=k;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					c=c+1;
					k=j+1;
					break;
				}
			}
		}
		System.out.println(c);
	}
}
/* test cases:
case=1
input=abcdef                                             
agcdk                                              
output=
3     
 
case=2
input=nikitha                                           
likita                                             
output=
5

case=3
input=helle                                              
bye                                                
output=1

case=4
input=java                                               
python                                             
output=0 
*/