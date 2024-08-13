import java.io.*;
class FileInpStream
{
   public static void main(String[] args) throws IOException,FileNotFoundException
   {
     int  ch;     
     FileInputStream   fis = new   FileInputStream("sample.txt");
    while((ch=fis.read())!=-1)
    {
       System.out.print((char)ch+" ");
    }
    fis.close();
}
} 