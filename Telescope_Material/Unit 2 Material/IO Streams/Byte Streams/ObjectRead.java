//To demonstrate how to retrieve and display all the objects present in the file.

import java.io.*;
import java.util.*;

class ObjectRead
{
   public static void main(String args[]) throws Exception
   {
      FileInputStream fis=new FileInputStream("student.dat");

      ObjectInputStream ois=new ObjectInputStream(fis);
      
      for(int count=1;count<=3;count++)
      {
       Student s=(Student)ois.readObject();//Object
       System.out.println(s);
      }
      ois.close();
    }
}
