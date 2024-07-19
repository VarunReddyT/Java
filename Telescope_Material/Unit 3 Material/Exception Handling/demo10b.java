// Exceptions with Nested try-catch blocks

import java.util.*;
class demo10b
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values:");
		int a,b,c;
		try
		{
			a=s.nextInt();
			b=s.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch(InputMismatchException e)
		{
			s.nextLine();
			System.out.println("Invalid input, Enter values again:");
			try
			{
				a=s.nextInt();
				b=s.nextInt();
				c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Divide by zero Error");
			}
		}
	}
}
