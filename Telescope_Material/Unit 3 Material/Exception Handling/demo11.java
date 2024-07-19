/* Unhandled exceptions in method calls, it is propogated to its caller
(Exception propagation)*/

import java.util.*;
class demo11
{
static void meth1(int a)
{
	int b;
    try
     {
       if(a==1) 
		b=10/(a-1);
       else
       {
         int c[]={1,2,3};
         c[a]=4; 
       }
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
      System.out.println("Invalid index");
     }
}
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
  int a=s.nextInt();
  try
  {
     int b=10/a;
     System.out.println(b);
     method1(a);
  }
  catch(ArithmeticException e)
  {
    System.out.println("Divide by zero Error");
  }
}

}
