// To demonstrate how to read lines,password from console.
import java.io.*;

class ConsoleDemo2
{
	public static void main(String args[])throws IOException
	{
	Console c = System.console();

	String username = c.readLine("enter username");

	char [] password = c.readPassword("enter pwd");

	System.out.println(username);
	System.out.println(password);
	}
}
