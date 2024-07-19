/*
Given an array arr[] of N integers, the task is to find the maximum difference 
between any two elements of the array.

Sample input=
5                       //size of the array  
20 40 10 50 30          //array elements

Sample output=
40                      //Maximum difference
*/

import java.util.*;
public class Test3A
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] a=new int[n];
    	for(int i=0;i<n;i++)
		{
	        a[i]=sc.nextInt();
	    }
	    int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
	    	if(a[i]>max)
	    	    max=a[i];
	    	if(a[i]<min)
	    	    min=a[i];
		}
		System.out.println(max-min);
	}
}

/*TEST CASES
case=1
input=5                                                  
20 40 10 50 30                                      
output=
40

case=2
input=8                                                  
8 2 3 9 1 12 7 5                                   
output=
11

*/

