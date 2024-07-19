/* Java program to illustrate find sum of odd numbers using autoboxing and unboxing  */

import java.io.*; 
import java.util.*; 
  
class  autoboxing1
{ 
    public static int sumOfOddNumber(List<Integer> list) 
    { 
        int sum = 0; 
        for (Integer i : list) 
        { 
            // unboxing of i automatically 
            if(i % 2 != 0) 
                sum += i; 
        } 
        return sum; 
    } 
  
    public static void main (String[] args) 
    { 
        List<Integer> list = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) 
        list.add(i); 
	//float f=4.5f;
	//list.add(f);
        int sumOdd = sumOfOddNumber(list); 
        System.out.println("Sum of odd numbers = " + sumOdd); 
    } 
} 