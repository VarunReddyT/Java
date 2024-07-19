//StringTokenizer class example program

import java.util.*;
public class String11
{
  public static void main(String args[])
  {
    System.out.println("StringTokenizer Constructor 1 - ");
    StringTokenizer st1 = new StringTokenizer("Hello students\nWelcome to   Java class");
	while (st1.hasMoreTokens())
	{
	  String s = st1.nextToken();
      	System.out.println(s);
	}
    
	System.out.println("\nStringTokenizer Constructor 2 - ");
    StringTokenizer st2 = new StringTokenizer("JAVA : _Code : String", ":");
	while (st2.hasMoreTokens())
      System.out.println(st2.nextToken());
    
	System.out.println("\nStringTokenizer Constructor 3 - ");
    StringTokenizer st3 = new StringTokenizer("JAVA_: Code_: String_", "_:",  true);
    
	System.out.println("Number of tokens=" + st3.countTokens());
	while (st3.hasMoreElements())
      System.out.println(st3.nextElement());
	
  }
}