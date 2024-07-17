// 3. Write a Java program to compare two sets and retain elements that are the same.

import java.util.HashSet;
import java.util.Iterator;
public class Same_Elem_3 {
    public static void main(String[] args) {
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("Red");
        hashset1.add("Blue");
        hashset1.add("Green");
        hashset1.add("Black");
        
        HashSet<String> hashset3 = new HashSet<String>();
        hashset3 = (HashSet) hashset1.clone();

        HashSet<String> hashset2 = new HashSet<String>();
        hashset2.add("Red");
        hashset2.add("Pink");
        hashset2.add("Green");
        hashset2.add("White");  

        // Method 1: Using retainAll() method

        hashset1.retainAll(hashset2);
        System.out.println("Common elements: " + hashset1);
        

        // Method 2 : Using iterator

        Iterator<String> iterator = hashset3.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (!hashset2.contains(element)) {
                iterator.remove();
            }
        }

        System.out.println("Common elements: " + hashset3);

    }
}
