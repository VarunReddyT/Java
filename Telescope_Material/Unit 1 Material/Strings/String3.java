//Searching last occurance of a substring in a given String
public class String3 
{
   public static void main(String[] args) {
      String str = "Hello world, Hello Reader";
      int lastIndex = str.lastIndexOf("Hello");
      if(lastIndex == - 1){
         System.out.println("Hello not found");
      } 
	  else {
         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
      }
   }
}




//To search a word inside a string
/*public class String3
{
   public static void main(String[] args) 
   {
      String str = "Hello readers";
      int intIndex = str.indexOf("Hello");
      
      if(intIndex == -1) {
         System.out.println("Hello not found");
      } else {
         System.out.println("Found Hello at index " + intIndex);
      }
	  System.out.print(str.contains("readers")); //to search a word within a String 
   }
}
*/
