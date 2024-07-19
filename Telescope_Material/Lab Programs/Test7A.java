/*
Write a Java Class to implement a method Addition() that returns a new Array where each array element at the index k corresponds to the sum of elements of the array starting at index 0 and including element at the index 'k'. For example, for array [2,3,5], the method will return array [2,5,10]. For an array of size '0' or a null parameter, the method will throw exception IllegalArgumentException with the message "Invalid Argument".

Sample IO 1:
------------

Enter Array Size:
5
Enter Array Elements:
1 2 3 4 5
[1, 3, 6, 10, 15]

Sample IO 2:
------------
Enter Array Size:
0
Invalid Argument

*/

import java.util.Arrays;
import java.util.Scanner;
class Test7A
{
	static int[] addition(int[] a) 
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			sum+=a[i];
			a[i]=sum;		 
		}
		return a;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter Array Size: ");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[];
		try
		{
			if (n>0)		
				arr=new int[n];
			else
				throw new IllegalArgumentException();
			
			System.out.println("Enter Array Elements: ");
			for (int i=0;i<n ;i++ )
			{
				arr[i]=sc.nextInt();
			}
			int res[]=addition(arr);
			System.out.println(Arrays.toString(res));	
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Invalid Argument");
		}
	}
}
