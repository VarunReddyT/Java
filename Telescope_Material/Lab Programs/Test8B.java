/* 8 b. Write a program to find the most common words in the list of words given in sorted order based on occurrence from largest to smallest. If any of words are having same occurrence then consider the smallest character order comes first.

Input format: 
First line contains the list of words and 
next line contains a number (k) which represent the top most words to display.
Output format: 
display the k top most words.

Sample Input:
-------------
the square root of four nine three seven two eight four is two two two two
4

Sample Output:
--------------
two four eight is
*/
import java.util.*;
 class Test8B
 {
     public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int cnt=sc.nextInt();
		String arr[]=s.split(" ");
		
		Map <String,Integer> ch=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			String x=arr[i];
			int c=ch.getOrDefault(x,0)+1;
			ch.put(x,c);
		}

		class ValComparator implements Comparator<String>
		{
			public int compare(String k1, String k2)
			{
				int cmp=ch.get(k2).compareTo(ch.get(k1));
				if (cmp == 0)
					return k1.compareTo(k2);
				else
					return cmp;
			}
		}
		 
		Map <String,Integer> ch1=new TreeMap<String,Integer>(new ValComparator());
		for(Map.Entry<String, Integer> l1 : ch.entrySet())
		{		
			ch1.put(l1.getKey(),l1.getValue()); 				 
		}
		
		for(Map.Entry<String, Integer> l2 : ch1.entrySet())
		{
			System.out.print(l2.getKey()+" ");
			cnt--;
			if(cnt==0)
				break;
		}
     }
 }

/*test cases:
case=1
input=the square root of four nine three seven two eight four is two two two two
4
output=
two four eight is

case=2
input=to do how to to when to complete                                                                                        
5                                                                                                                       
output=
to complete do how when                                                                                                 
*/