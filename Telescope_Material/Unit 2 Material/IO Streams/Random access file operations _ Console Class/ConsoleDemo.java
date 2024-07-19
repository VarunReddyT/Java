// To demonstrate how to write formatted data on monitor.
import java.io.*;
class ConsoleDemo
{
	public static void main(String args[]) throws Exception
	{
		Console c = System.console();

		double radius = 2.0;

		double area = Math.PI * radius * radius;

		c.format("RESULT = %.2f %n",area);
	}
}
