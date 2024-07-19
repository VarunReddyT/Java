// To demonstrate throws keyword

import java.io.*;

class demo12
{
  static void meth1() throws FileNotFoundException 
  {
    FileInputStream fis=new FileInputStream("demo2.java");
	System.out.println("File opened sucessfully");
  }
  public static void main(String args[]) throws FileNotFoundException
  {
	meth1();
	
	/*try
	{
	meth1();
	}
	catch(FileNotFoundException fe)
	{
		System.out.println(fe);
	}*/

   }
}
