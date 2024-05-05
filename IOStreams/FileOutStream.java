import java.util.*;
import java.io.*;
class  FileOutStream
{
 public static void main(String[] args) throws Exception
 {

   FileOutputStream   fos = new   FileOutputStream("write.txt");
   String   s = "Welcome to IO Streams";
   byte   b[] = s.getBytes();
   for(int i=0;i<b.length;i++)
       fos.write(b[i]);   
   fos.close();
   System.out.println("data writen to the File."); 
 }
}