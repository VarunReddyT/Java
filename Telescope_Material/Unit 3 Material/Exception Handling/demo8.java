//Program to demonstrate multi catch
import java.util.Scanner; 
public class demo8
{ 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in); 
		try
		{ 
			int n = Integer.parseInt(sc.next()); 
			if (99%n == 0) 
				System.out.println(n + " is a factor of 99"); 
			else
				System.out.println(n + " is not a factor of 99");
		} 
		catch (ArithmeticException|NumberFormatException ex) //only subclasses of RuntimeException
		{ 
			System.out.println("Error: " + ex); 
			
		} 
		
	} 
} 
