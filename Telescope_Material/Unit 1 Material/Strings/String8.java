//splits a string into a number of substrings with the help of str split(string) method
public class String8
{
   public static void main(String args[]) 
   {
      String str = "jan-feb-march";
      String[] temp;
      String delimeter = "-";
      temp = str.split(delimeter);
      
      for(int i = 0; i < temp.length; i++) 
	  {
         System.out.println(temp[i]);
	  }
   }
}