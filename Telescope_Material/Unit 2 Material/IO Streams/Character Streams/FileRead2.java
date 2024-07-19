//To demonstrate BufferedReader to read a line at a time.

import java.io.*;

class FileRead2
{
public static void main(String args[]) throws IOException
{
  FileReader fr=new FileReader("input2.txt");
  
  BufferedReader br=new BufferedReader(fr);
  
  String s;
  
  System.out.println("The File Content is:\n");
  
  while((s=br.readLine())!=null)
      System.out.println(s);
  

  br.close();
}
}

