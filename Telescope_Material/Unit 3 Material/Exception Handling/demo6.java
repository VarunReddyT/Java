// To demonstration finally block another example (return statement)
class demo6
{
  public static void main(String[] args)
  {
    int a=10,b=0,c;
    try
    {
      c=a/b;
      System.out.println("result= "+c);
      return; //System.exit(0);
    }

     catch(ArithmeticException ae)
     {
	System.out.println(ae);
     }
    finally
    {
       System.out.println("From finally block");
    }    
    
    System.out.println("End..");
  }
}

