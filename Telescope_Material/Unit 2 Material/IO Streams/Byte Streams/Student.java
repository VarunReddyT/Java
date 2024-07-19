import java.io.*;

public class Student implements Serializable
{
   public String rno;
   public transient String name;
   
   public Student(String rno,String name)
   {
     this.rno=rno;
     this.name=name;
   }
   public String toString()
   {  
      return "ROLL NO="+rno+" NAME="+name;
   }
}

