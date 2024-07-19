// TO demonstrate how to read the content of the file using BufferedInputStream class.

import java.io.*;

class BufferRead
{
   public static void main(String[] args) throws IOException
   {
     FileInputStream fis=new FileInputStream("ex1.txt");
     BufferedInputStream bis=new BufferedInputStream(fis);
	 System.out.println("Contents of the file....\n");
     
	 int ch=bis.read();
    while(ch!=-1)
    {
       System.out.print((char)ch);
	   ch=bis.read();
    }
   bis.close();
}
}

