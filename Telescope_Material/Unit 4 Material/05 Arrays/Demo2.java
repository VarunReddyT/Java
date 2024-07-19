// Java program to demonstrate methods of Arrays class

import java.util.Arrays;

public class Demo2
{
	public static void main(String[] args)
	{
		int arr1[] = { 10, 20, 15, 22, 35 };

		//To Sort an array
		Arrays.sort(arr1);

		int intKey = 22;
		//To Search an element
		int index = Arrays.binarySearch(arr1, intKey);
		System.out.println(intKey+ " found at index = " + index);
		
		// To print the elements in one line
        System.out.println("Integer Array1: "+ Arrays.toString(arr1));
		
		//To copy specified array
		int arr2[] = Arrays.copyOf(arr1,5);		//check with different sizes (3,5)
		System.out.println("Integer Array2: "+ Arrays.toString(arr2));
		
		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.equals(arr1, arr2));
		
		int arr3[] = new int[8];
		//To fill the arrays
		Arrays.fill(arr3, 10);
		System.out.println("Integer Array3: "+ Arrays.toString(arr3));
	}
}
