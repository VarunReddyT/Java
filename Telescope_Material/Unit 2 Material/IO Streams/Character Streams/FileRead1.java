// To demonstrate FileReader.
import java.io.*;

class FileRead1
{
   public static void main(String[] args) throws IOException
   {
	int ascii;
	char c[]=new char[50];

	FileReader fr=new FileReader("input1.txt");

	System.out.println("Contents of the file....");

	//1. Read characters from fr into ch,and display it on the screen,repeat this till end of the file is reached

	/*while((ascii=fr.read())!=-1)
	{
		System.out.print((char)ascii);
	}*/
	//2. Reading character array at a time
	System.out.println(fr.read(c));
	for(char x:c)
		System.out.print(x);

	//close the file handle.
	fr.close();
}
}

