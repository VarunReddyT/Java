import java.io.*;
class BufferInpStream
{
   public static void main(String[] args) throws IOException,FileNotFoundException
   {
     int ch;
     FileInputStream  fis= new  FileInputStream("sample.txt");
     BufferedInputStream   bis = new  BufferedInputStream(fis);
    while((ch=bis.read())!=-1)
    {
       System.out.print((char)ch);
    }
    bis.close();
}
}