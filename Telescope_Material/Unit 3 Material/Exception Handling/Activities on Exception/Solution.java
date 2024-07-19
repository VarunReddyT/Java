/*Write a Java program that calculates the division of two numbers provided by the user. 
Handle the ArithmeticException if the user tries to divide by zero.

Sample Input & output 1:
--------------------------

Enter 2 integers:                                                                                                       
10                                                                                                                      
5                                                                                                                       
Result= 2 

Sample input & output 2:
-------------------------

Enter 2 integers:                                                                                                       
5                                                                                                                       
0                                                                                                                       
Exception: / by zero
*/
import java.util.*;
class Solution
{
    public static void main(String rags[])
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 integers:");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
        try
        {
    		System.out.println("Result= "+a/b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception: "+ae.getMessage());
        }
    }
}

/*Test cases
case=1
input=10
5
output=
Enter 2 integers:                                                                                                       
Result= 2 

case=2
input=5
0
output=
Enter 2 integers:                                                                                                       
Exception: / by zero

case=3
input=11
3
output=
Enter 2 integers:                                                                                                       
Result= 3 

case=4
input=8
0
output=
Enter 2 integers:                                                                                                       
Exception: / by zero
*/