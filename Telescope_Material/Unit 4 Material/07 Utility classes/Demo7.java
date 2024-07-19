//Formatter class example program
import java.util.*;
class Demo7 
{
	public static void main(String args[]) 
	{
		Formatter fmt = new Formatter();

		fmt.format("Formatting %s is easy.\nValues %d %.2f","with Java", 10, 98.6);

		System.out.println(fmt);

		fmt.close();
	}
}
