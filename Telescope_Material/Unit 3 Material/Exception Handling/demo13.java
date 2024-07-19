// To demonstrate unchecked exception handling without throws

import java.io.*;

class demo13
{
  static void meth1() 
  {
    try
    {
      FileInputStream fis=new FileInputStream("ex1.dat");
	  System.out.println("File opened sucessfully");
    }
    catch(FileNotFoundException e)
    {
      System.out.println("plz check your filename");
    }
    
  }
  public static void main(String args[])
  {
      meth1();
  }
}
