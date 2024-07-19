// To demonstrate how retrieve information about a file.
import java.io.*;

class File1
{
public static void main(String args[])
{
	File f1=new File("Dir1/File2.txt");
	System.out.println("NAME: "+f1.getName());
	System.out.println("PATH: "+f1.getPath());
	System.out.println("ABSOLUTE PATH: "+f1.getAbsolutePath());
	System.out.println("PARENT: "+f1.getParent());
	System.out.println("EXISTS: "+f1.exists());
	System.out.println("LENGTH: "+f1.length());
	System.out.println("READABLE: "+f1.canRead());
	System.out.println("WRITABLE: "+f1.canWrite());
	System.out.println("IS DIRECTORY: "+f1.isDirectory());
	System.out.println("IS FILE: "+f1.isFile());
}
}
