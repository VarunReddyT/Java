//Example of applying Enum on a switch statement

class Ex4
{  
	enum Day
	{ 
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}  
	public static void main(String args[])
	{  
		Day d=Day.MONDAY;   
		switch(d)
		{  
			case SUNDAY:   
			 System.out.println("sunday is funday");  
			 break;  
			case MONDAY:   
			 System.out.println("monday is boring day");  
			 break;  
			default:  
			System.out.println("other day");  
		}  
	}
} 