//Java program to demonstrate Scanner Class 

import java.util.Scanner; 
public class ScannerDemo
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter 2 integers:");
		//To read Integers
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);

		//To read String 
		System.out.println("Enter a string:");
		String str1 = sc.next();
		System.out.println(str1);
		
		//sc.nextLine();
		System.out.println("Enter a line of string:");
		String str2 = sc.nextLine();
		System.out.println(str2);

		//To read a character
		System.out.println("Enter a Character:");
		char c = sc.next().charAt(0);
		System.out.println(c); 
	} 
} 
