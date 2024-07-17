// 2. Write a Java program to clone a hash set to another hash set.
import java.util.HashSet;

public class Clone_HashSet_2 {
    public static void main(String[] args) {
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("Red");
        hashset1.add("Blue");
        hashset1.add("Green");
        hashset1.add("Black");

        System.out.println("First HashSet: " + hashset1);

        @SuppressWarnings("unchecked")
        HashSet<String> hashset2 = (HashSet<String>) hashset1.clone();

        System.out.println("Cloned HashSet: " + hashset2);

    }
}
