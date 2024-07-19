// To demonstrate FileWriter,Read characters from keyboard and write them onto a file.

import java.util.*;
import java.io.*;
class FileWrite1
{
 public static void main(String[] args) throws IOException
 {
   char ch;
   Scanner sc=new Scanner(System.in);
   FileWriter fw=new FileWriter("ex1.txt");
   
   System.out.println("Enter a Line of characters");
   String s=sc.nextLine();

   //1. Writing character by character to a file
   for(int i=0;i<s.length();i++)
      fw.write(s.charAt(i));
   fw.write("\n");
   //2. Writing character array to a file
   char chars[]=s.toCharArray();
   fw.write(chars);
   fw.write("\n");

   //3. Writing whole string into a file at a time 
   fw.write(s);
   fw.write("\n");
   //4. Writing whole string into a file at a time (with offsets)
   fw.write(s,0,10);
   fw.write("\n");
   //Appending Character or character sequence to a file
   fw.append('z');
   fw.append("string");
    fw.close();

   }
}

