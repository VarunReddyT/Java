//Calendar class example program

import java.util.*;

class Demo6 
{
public static void main(String args[]) 
{
	/*getInstance() method is used with calendar object to get the instance of calendar 
	according to current time zone set by java runtime environment*/

	Calendar calendar = Calendar.getInstance();	
	String months[] = {
	"Jan", "Feb", "Mar", "Apr",
	"May", "Jun", "Jul", "Aug",
	"Sep", "Oct", "Nov", "Dec"};

	System.out.print("Date: ");

	System.out.print(calendar.get(Calendar.DATE)+" ");

	int m=calendar.get(Calendar.MONTH);	//0-11

	System.out.print(months[m]+" ");

	System.out.println(calendar.get(Calendar.YEAR));
	
	System.out.print("\nTime: ");

	System.out.print(calendar.get(Calendar.HOUR) + ":");

	System.out.print(calendar.get(Calendar.MINUTE) + ":");

	System.out.println(calendar.get(Calendar.SECOND)); 
}
}
