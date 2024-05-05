import java.io.*;
import java.util.*;
class  DataOutStream
{
 public static void main(String[] args) throws IOException
 {
    int  i, x;
    Scanner  s = new  Scanner(System.in);
    FileOutputStream  fos = new  FileOutputStream("write2.txt");
    DataOutputStream  dos = new  DataOutputStream(fos);
    //reading 5 integers from keyboard & writing them onto a file.
   for(i=1;i<=5;i++)
    {
      System.out.println("enter the number:");
      x=s.nextInt();  // x=14
      dos.writeInt(x);
    }
    dos.close();
}
}