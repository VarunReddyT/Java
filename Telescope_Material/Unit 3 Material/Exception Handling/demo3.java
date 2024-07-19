// To demonstration finally block 
class demo3
{
  public static void main(String[] args)
  {
    int a=10,b=0,c;
    try
    {
      c=a/b;
      System.out.println("result= "+c);
    }
    catch(NullPointerException ae)
    {
    System.out.println(" Error: "+ae);
    }
    finally
    {
       System.out.println("This will execute");
    }
    System.out.println("END");   
  }
}

