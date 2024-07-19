import java.util.*;
class StringTest
{
	public static void main(String args[])
	{
		/*String s1=new String("hello");
		String s2="hello";//literal
		String s3="hello";//literal
		String s4=new String("hello");
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//true
		System.out.println(s1==s4);//false*/
		
		String s=new String("kmit");
		//System.out.println(s);
		String s1=s.concat("college");//kmitcollege
		//System.out.println(s);
		//System.out.println(s1);
		String s2="  he l lo  ";
		String arr[]={"nikitha", "mounica"};
		System.out.println(String.join(":",arr));
		String sarr[]="hello everyone".split("o");
		System.out.println(sarr.length);
		System.out.println(Arrays.toString(sarr));
   }

}