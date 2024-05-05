import java.util.*;
import java.io.*;
class   FileWrite
{
 public static void main(String[] args) throws IOException
 {
       char ch;
       Scanner sc=new Scanner(System.in);
        FileWriter   fw=new   FileWriter("write3.txt");
      System.out.println("enter a Line of characters");
      String s=sc.nextLine();
      for(int i=0;i<s.length();i++)
                fw.write(s.charAt(i));
      fw.close();
   }
}