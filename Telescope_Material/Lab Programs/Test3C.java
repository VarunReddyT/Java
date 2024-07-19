/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
Examples: 
Input: arr[]   = {3, 0, 0, 2, 0, 4}
Output: 10
 
We can trap "3*2 units" of water between 3 an 2, "1 unit" on top of bar 2 and "3 units" between 2 and 4.  
*/
import java.util.*;
class Test
{
// Function to return the maximum water that can be stored
public static int maxWater(int[] arr, int n)
{
	// To store the maximum water that can be stored
	int res = 0;
	// For every element of the array except first and last element
	for(int i = 1; i< n - 1; i++)
	{
		// Find maximum element on its left
		int left = 0;
		for(int j = 0; j <i; j++)
		{
			left = Math.max(left, arr[j]);
		}
		// Find maximum element on its right
		int right = 0;
		for(int j = i + 1; j < n; j++)
		{
			right = Math.max(right, arr[j]);
		}
		// Update maximum water value
		int min=Math.min(left, right);
		if(min>arr[i])
			res += min - arr[i];
	}
	return res;
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
	
	System.out.print(maxWater(arr,n));
}
}

/*test cases:
case=1
input=6                                                                                                                       
3 0 0 2 0 4                                                                                                             
output=
10                                                                                                                      

case=2
input=6                                                                                                                       
3 1 2 4 0 5                                                                                                               
output=
7

case=3
input=8                                                                                                                       
5 3 6 1 4 5 2 7                                  
output=
14                                                                     */                                                 
  
  