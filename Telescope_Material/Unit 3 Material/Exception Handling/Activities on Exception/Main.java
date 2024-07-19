/*
Problem Statement: Create a custom exception called "NegativeValueException" that should be thrown when a negative value is encountered. 
Write a program that accepts an integer input from the user and throws this exception if the input is negative.

Sample Input & output 1
------------------------
Enter a positive number: 5
Entered number: 5 

Sample Input & output 2
------------------------
Enter a positive number: -5
Exception: Negative value encountered!

*/

import java.util.*;
class NegativeValueException extends Exception 
{
    public NegativeValueException(String message) 
  {
        super(message);
    }
}
class Main 
{
    public static void main(String[] args) 
	{
        try 
		{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            if (number < 0)
			{
                throw new NegativeValueException("Negative value encountered!");
            }
            System.out.println("Entered number: " + number);
        } 
		catch (NegativeValueException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
/*
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
/*
Problem 1: Custom Exception: The idea is to take an input of positive integer number. If a negative number is entered, it should throw an exception. And if other datatypes like floating point values are allocated, it will return input mismatch exception 
*/