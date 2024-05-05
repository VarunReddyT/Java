import java.io.*;
class FileInpStream
{
   public static void main(String[] args) throws IOException,FileNotFoundException
   {
     int  ch;     
     FileInputStream   fis = new   FileInputStream("sample.txt");
    while(true)
    {
        ch=fis.read();
        if(ch==-1)
             break;
       System.out.print((char)ch+" ");
    }
    fis.close();
}
}