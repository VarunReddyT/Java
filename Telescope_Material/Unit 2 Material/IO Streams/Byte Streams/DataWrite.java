//To demonstrate how to read integer values from keyboard and write them onto a file(DataOutputStream).

import java.io.*;
import java.util.*;

class DataWrite
{
 public static void main(String[] args) throws Exception
 {
   int i,x;
   //Scanner s=new Scanner(System.in);
   FileOutputStream fos=new FileOutputStream("file1.dat");
   DataOutputStream dos=new DataOutputStream(fos);
   
   //reading 5 integers from keyboard & writing them onto a file.
   int arr[]={1,2,3,4,5};
   for(i=0;i<5;i++)
    {
      dos.writeInt(arr[i]);
    }
    dos.close();
}
}

