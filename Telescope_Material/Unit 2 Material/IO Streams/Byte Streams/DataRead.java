//To demonstrate how to retrieve all integer values present in the file(using DataInputStream) and display on the monitor.

import java.io.*;
import java.util.*;
class DataRead
{
 public static void main(String[] args) throws Exception
 {
   int x;
   //retieving the integer values from the file and displaying on console
   FileInputStream fis=new FileInputStream("file1.dat");
   DataInputStream dis2=new DataInputStream(fis);
   
   while(dis2.available()>0)
    {
      x=dis2.readInt();
      System.out.println(x);
    }
   dis2.close();
}
}

