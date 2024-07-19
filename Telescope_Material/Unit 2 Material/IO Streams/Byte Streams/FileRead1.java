//demonstrates how to read a byte at a time from the file and display on the monitor.

import java.io.*;
class FileRead1
{
   public static void main(String[] args) throws Exception
   {
     
     FileInputStream fis=new FileInputStream("ex1.txt");
     System.out.println("Contents of the file....");
     
    //Read characters from fis into ch,and display it on the screen,
	//repeat this till end of the file is reached.

    int ch=fis.read();
    while(ch!=-1)
    {        
		System.out.print((char)ch);
		ch=fis.read();
    }
    //close the file handle.
    fis.close();
}
}

//Write a java program to copy the content of one file to another file