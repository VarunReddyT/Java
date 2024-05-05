import java.io.*;
class BufferRead
{
public static void main(String args[]) throws IOException
{
  FileReader   fr=new  FileReader("sample.txt");
  BufferedReader br=new BufferedReader(fr);
  String s;
  
  System.out.println("The File Content is:");
  while((s=br.readLine())!=null)
      System.out.println(s);
  br.close();
}
}