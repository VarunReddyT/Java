/*
You are given a string S of alphabet characters and the task is to find its matching decimal representation as on the shown keypad (refer lab syllabus for image). 
Output the decimal representation corresponding to the string. 

For example: if you are given "amazon" then its corresponding decimal representation will be 262966.
 
Sample:
input=amazon                                                 
output=262966 
                                                
*/
import java.io.*;
import java.util.*;
class Keypad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] ch = new char[str.length()];
		for (int i = 0; i<str.length(); i++)
		{
			ch[i] = str.charAt(i);
			switch (ch[i])
			{
				case 'a':case 'b':case 'c':
					System.out.print("2");
					break;
				case 'd':case 'e':case 'f':
					System.out.print("3");
					break;
				case 'g':case 'h':case 'i':
					System.out.print("4");
					break;
				case 'j':case 'k':case 'l':
					System.out.print("5");
					break;
				case 'm':case 'n':case 'o':
					System.out.print("6");
					break;
				case 'p':case 'q':case 'r':case 's':
					System.out.print("7");
					break;
				case 't':case 'u':case 'v':
					System.out.print("8");
					break;
				case 'w':case 'x':case 'y':case 'z':
					System.out.print("9");
					break;
				default:
					System.exit(0);
					break;
			}
		} 
	}
}
//OR
/*
import java.io.*;
import java.util.*;
class Test4C
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
 		str=sc.next();
		String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String num="";
		for (int i=0; i< str.length(); i++)
  		{
 			String ch=""+str.charAt(i);
			for(int j=2;j<=9;j++)
			{
				if(keypad[j].contains(ch))
				{
					num+=j;
					break;
				}
			}
		}
		System.out.println(num);
	}
}*/
/*test cases
case=1
input=amazon                                             
output=262966                                            

case=2
input=java                                               
output=5282

case=3
input=python                                            
output=798466                                             
*/
