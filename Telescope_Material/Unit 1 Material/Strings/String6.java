//to reverse a String using StringBuffer Class
public class String6
{
   public static void main(String[] args) 
   {
      String str = "students";

	StringBuffer sb=new StringBuffer(str);
	System.out.println("sb="+sb);
	StringBuffer sb2=sb.reverse();
	System.out.println("after reverse sb="+sb);
	System.out.println(sb2);
	String str2=sb2.toString();
	System.out.println("str2="+str2);
   }
}