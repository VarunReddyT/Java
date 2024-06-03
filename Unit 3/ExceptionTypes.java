
// Types of exceptions:
// 1. Checked Exception
// 2. Unchecked Exception
// 3. Error

// Checked Exception: The classes which are direct child classes of Throwable class except RuntimeException and Error are called checked exceptions. These are checked at compile time.
// Examples: IOException, SQLException, ClassNotFoundException, etc.

// Unchecked Exception: The classes which are direct child classes of RuntimeException are called unchecked exceptions. These are checked at runtime.
// Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.

// Error: The classes which are direct child classes of Error are called errors. These are also checked at runtime.

public class ExceptionTypes
{
  public static void main(String[] args)
  {
    try
    {
      int a = 10;
      int b = 0;
      int c = a/b;
      System.out.println("Result: " + c);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Arithmetic Exception: " + e);
    }
    catch(Exception e)
    {
      System.out.println("Parent Exception: " + e);
    }
    finally{
        System.out.println("Finally block is always executed");
    }
  }
}