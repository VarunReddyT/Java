//To demonstrate catch all catch block
import java.util.Scanner;
class demo9
{
  public static void main(String[] args)
  {
    int a[]={10,20,30,40,50,60};
    Scanner sc=new Scanner(System.in);
    try
    {
      System.out.println("Enter 2 values:");
      int x=sc.nextInt();
      int y=sc.nextInt(); 
      int c=a[x]/y;
      System.out.println("result= "+c);
    }
     
    catch(Exception e)
    {
      System.out.println("Error:"+e);
    } 
    
    finally
    {
      System.out.println("this will execute");
    }
  }
}

