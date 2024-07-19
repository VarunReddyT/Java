// Exceptions with Nested try blocks

import java.util.*;
class demo10
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number:");
  int a,b,c,d;
  a=s.nextInt();
  try
  {
     b=10/a;
     System.out.println(b);
     try
     {
       if(a==1)
	   {
		   c=10/(a-1);
		   System.out.println(c);
	   }
       else
       {
			int m[]={1,2,3,5,10};
			m[a]=4; 
			int x=Integer.parseInt("a10");
       }
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
      System.out.println("Invalid index");
     }
     finally
     {
      System.out.println("Inner finally");
     }
  }
  catch(ArithmeticException e)      
  {
    System.out.println("Divide by zero Error");
  }
  finally
     {
      System.out.println("Outer finally");
     }

}
}
