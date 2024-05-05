import java.io.*;
import java.util.*;
class Student implements Serializable
{
     public String rno;
     public String name;
     public Student(String rno,String name)
     {
         this.rno=rno;
         this.name=name;
     }
     public void display()
     { 
          System.out.println("ROLL NO="+rno+" NAME="+name);
      }
}
public class  WriteObject
{
 public static void main(String args[]) throws IOException,ClassNotFoundException
 {
      FileOutputStream fos=new FileOutputStream("student.dat");
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      Student s1=new Student("22BD1A051U","Varun");
      oos.writeObject(s1);
      Student s2=new Student("22BD1A051O","Unknown");
      oos.writeObject(s2); 
      Student s3=new Student("22BD1A051S","Unknown 2");
      oos.writeObject(s3);
      oos.close();
  }
}