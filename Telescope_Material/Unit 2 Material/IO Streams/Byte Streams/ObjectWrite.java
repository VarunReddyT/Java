//To demonstrate how to write object onto a File.

import java.io.*;
import java.util.*;

class ObjectWrite
{
   public static void main(String args[]) throws Exception
   {
      FileOutputStream fos=new FileOutputStream("student.dat");

      ObjectOutputStream oos=new ObjectOutputStream(fos);
       
      Student s1=new Student("15BD1A0501","Smitha");
      oos.writeObject(s1);

      Student s2=new Student("15BD1A0502","Shiva");
      oos.writeObject(s2);

      Student s3=new Student("15BD1A0503","Madhu");
      oos.writeObject(s3);

      System.out.println("objects saved in file."); 
          
      oos.close();
     
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
