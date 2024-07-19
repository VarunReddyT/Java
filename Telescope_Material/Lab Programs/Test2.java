/*A resistor is a circuit device designed to provide a specific resistance between its two ends. 
Resistance is expressed in ohms (Ω) or kilo-ohms (kΩ). Resistors are usually marked with 
coloured bands that encode their resistance, as shown in figure 1 (refer lab syllabus). 
The first two bands represent digits and the third is a power-of-ten multiplier.
 
The table shows (refer lab syllabus) the number value of each band colour. 
For example, if the first band is red (represents 2), the second is black (represents 0), 
and the third is orange (represents 3), the resistance is 20 × 103 Ω or 20 kΩ

Write a Resistor class containing the parameterized constructor,
which takes in three strings representing the three band colours. 
Write the methods to calculate and set the resistance for the resistor. 


Sample IO:

Enter resistor colors:
Red
Black
Orange
Resistance = 20000


*/

import java.util.*;
class Resistor
{
	String band1,band2,band3;
	String colors[]={"Black","Brown","Red","Orange","Yellow","Green","Blue","Voilet","Grey","White"};
	Resistor(String...bands)
	{
		band1=bands[0];
		band2=bands[1];
		band3=bands[2];
	}
	int resistance()
	{
		int i,d1=0,d2=0,m=0,res;
		for(i=0;i<10;i++)
		{
			if(band1.equals(colors[i]))
				d1=i;
			if(band2.equals(colors[i]))
				d2=i;
			if(band3.equals(colors[i]))
				m=i;
		}
		res=(d1*10+d2)*(int)Math.pow(10,m);
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter resistor colors:");
		String b1,b2,b3;
		b1=sc.next();
		b2=sc.next();
		b3=sc.next();
		Resistor obj=new Resistor(b1,b2,b3);
		System.out.println("Resistance = "+obj.resistance());
	   
	}
}

/* test cases

case=1
input=Red
Black
Orange
output=
Enter resistor colors:
Resistance = 20000

case=2
input=Brown                                           
Orange                                           
Green                                            
output=
Enter resistor colors:                           
Resistance = 1300000                           

*/