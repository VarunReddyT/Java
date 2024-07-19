//to reverse a String using character array
public class String7
{
   public static void main(String[] args) 
   {
      String input = "Hello world";
      char[] try1 = input.toCharArray();
      for (int i = try1.length-1;i >= 0; i--) 
		System.out.print(try1[i]);
   }
}