// To demonstration multiple catches prior to java 7
import java.util.*;
class demo7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int arr[]={10,20,30,40,50};
    System.out.println("Enter 2 values:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    try
    {
      int c=a/b;
      int x=arr[a];
      System.out.println("result= "+c);
      System.out.println("result= "+x);
      return;
    }
    catch(ArithmeticException ae)
    {
    System.out.println("Error:"+ae) ;
    }
    catch(ArrayIndexOutOfBoundsException ie)
    {
    System.out.println("Error:"+ie);
    }
    finally
    {
       System.out.println("From finally block");
    }
    System.out.println("End..");
  }
}

