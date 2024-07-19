 //to replace a substring
public class String5
{
   public static void main(String args[])
   {
      String str = "Hello World, Hello Students";
      System.out.println( str.replace( 'H','W' ) );//replaces all single character
      System.out.println( str.replace("He", "Wa") );
      System.out.println( str.replaceAll("He", "Ha") );//replaces all occurences of substring
	  System.out.println( str.replaceFirst("He", "Ha") );
	  System.out.println( str );
   }
}