//Retrieve characters from a string variable and 
//write them a byte at a time onto a file.

import java.util.*;
import java.io.*;
class FileWrite1
{
 public static void main(String[] args) throws Exception
 {
    int ch;int ch2;
   //Attach file name to FileOutputStream
   FileOutputStream fos=new FileOutputStream("ex1.txt");

   String s="Welcome to kmit College";

   byte b[]=s.getBytes();
   for(int i=0;i<b.length;i++)
       fos.write(b[i]);

	//or
   /*for(int i=0;i<s.length();i++)
      fos.write((int)s.charAt(i));*/
  
   fos.close();

   System.out.println("data writen to the File."); 

 }
}

