//Bitset Class example program with and(), or(), xor() methods
import java.util.BitSet;
public class Demo3
{
  public static void main(String args[]) 
  {
      BitSet bits1 = new BitSet();
      BitSet bits2 = new BitSet();
      
      for(int i = 0; i < 16; i++)
	  {
         if((i % 2) == 0) bits1.set(i);
         if((i % 5) != 0) bits2.set(i);
      }
     
      System.out.println("Initial pattern in bits1: ");
      System.out.println(bits1);
      System.out.println("\nInitial pattern in bits2: ");
      System.out.println(bits2);

      // AND bits (intersection)
      /*bits2.and(bits1);
      System.out.println("\nbits2 AND bits1: ");
      System.out.println(bits2);*/
	  
      // OR bits (union)
	 /* bits2.or(bits1);
      System.out.println("\nbits2 OR bits1: ");
      System.out.println(bits2);*/
	  
	  
      // XOR bits ((b2 unioun b1) - (b2 intersection b1)) 
	 /* bits2.xor(bits1);
      System.out.println("\nbits2 XOR bits1: ");
      System.out.println(bits2);*/
	  
   }
}