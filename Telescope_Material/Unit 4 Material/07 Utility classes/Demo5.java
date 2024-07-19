// Date class Program

import java.util.Date;

class Demo5 
{
	public static void main(String args[])
	{
		// Creating date
        Date date = new Date();
		System.out.println(date);

		/* Display number of milliseconds since midnight, January 1, 1970 GMT */
		long msec = date.getTime();
		System.out.println("Time: "+msec);
	}
}
