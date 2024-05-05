import java.io.*;
import java.util.*;
class ReadObject
{
 public static void main(String args[]) throws IOException,ClassNotFoundException
 {
     FileInputStream fis=new FileInputStream("student.dat");
     ObjectInputStream ois=new ObjectInputStream(fis);
     Student s=null;
     for(int i=0;i<3;i++)
      {
         s=(Student)ois.readObject();
          s.display(); 
      }
  }
}