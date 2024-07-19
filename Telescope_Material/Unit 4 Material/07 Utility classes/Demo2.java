// Bitset Class example program
import java.util.*; 
public class Demo2 
{ 
	public static void main(String[] args) 
	{  
		BitSet bs1 = new BitSet(); 
		BitSet bs2 = new BitSet(); 
		System.out.println("bs1 size: " + bs1.size());
		System.out.println("bs1 length: " + bs1.length());
		 
		bs1.set(0); 
		bs1.set(1); 
		bs1.set(2); 
		bs1.set(4); 
		System.out.println("bs1 : " + bs1); 
		System.out.println("bs1 size: " + bs1.size());
		System.out.println("bs1 length: " + bs1.length());
		bs1.clear();
		System.out.println("bs1 after clearing : " + bs1);
		
		System.out.println("\nbs2 size: " + bs2.size());
		System.out.println("bs2 length: " + bs2.length());
		
		bs2.set(4); 
		bs2.set(6); 
		bs2.set(5); 
		bs2.set(1); 
		bs2.set(2); 
		bs2.set(3);
		bs2.set(30);
		bs2.set(100,true);
		bs2.set(12,false);
		bs2.set(20,25);
		
		System.out.println("get value at index 100: "+ bs2.get(100));
		System.out.println("get value at index 98: "+ bs2.get(98));
		System.out.println("bs2 : " + bs2);
		System.out.println("bs2 is empty: " + bs2.isEmpty());
		System.out.println("bs2 size: " + bs2.size());
		System.out.println("bs2 length: " + bs2.length());
		
	} 
} 











