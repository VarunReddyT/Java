//To demonstrate BufferedWriter to read a line at a time.

import java.io.*;

class FileWrite2
{
public static void main(String args[]) throws IOException
{
  FileWriter fw=new FileWriter("ex2.txt");
  
  BufferedWriter bw=new BufferedWriter(fw);
  
  String s="hello students";
  
  for(int i=0;i<s.length();i++)
	bw.write(s.charAt(i));
	//or
  bw.write(s);
  bw.close();
}

}

