//String compare by equals() and == operator
public class String2
{
   public static void main(String []args)
   {
      String s1 = "Kmit";
      String s2 = "Kmit";
      String s3 = new String ("Kmit");
      String s4 = new String ("KMIT");
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s2.equalsIgnoreCase(s4));
      System.out.println(s1 == s2);
      System.out.println(s2 == s3);
   }
}