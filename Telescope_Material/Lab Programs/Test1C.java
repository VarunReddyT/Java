/*Cricketer's Pension Continuing our journey in mastering the conditional statements & our interest with cricket.
Let us help the Indian cricket's governing body (BCCI) to 
automate its plan of allotting pensions to former players. 
The rules are given below:  
If a player has played more than 10 test matches and 100 ODI's he receives Rs.50,000.
If a player has played more than 10 test matches he receives Rs.25,000.
If a player has played more than 100 ODI's he receives Rs.15,000.
If a player has played for India he receives Rs.10,000.
The amount is incremented by 1/4th for every 'man of the match' 
award.
If a player has not played for India but played IPL he receives an amount of Rs.8,000. 
If a player has not played for India nor IPL he receives an amount of Rs.7,000.
*/

import java.util.*;

public class Test1C
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Has he played for India?");
		char c1=sc.next().charAt(0);
		System.out.println("Has he played IPL?");
		char c2=sc.next().charAt(0);
		float amount=0.0f;
		
		if(c1=='y')
		{
			System.out.println("Enter no of Testmatches");
			int test=sc.nextInt();
			System.out.println("Enter no of ODIs");
			int odi=sc.nextInt();
			System.out.println("Enter the number of man of the matches");
			int mom=sc.nextInt();
			if(test>10 && odi>100)
			{
				amount+=50000;
			}
			else if(test>10)
			{
				amount+=25000;
			}
			else if(odi>100)
			{
				amount+=15000;
			}
			else
			{
			   amount+=10000; 
			}
			amount+=amount*0.25f*mom;
			System.out.println(amount);
			System.exit(100);
		}
		else if(c2=='y')
		{
			System.out.println("Enter the number of man of the matches");
			int mom=sc.nextInt();
			amount+=8000;
			amount+=amount*0.25f*mom;
			System.out.println(amount);
			System.exit(100);
		}
		else
		{
			amount+=7000;
			System.out.println(amount);
			System.exit(100);
		}
	}
}