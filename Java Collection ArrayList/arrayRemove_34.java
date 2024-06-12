// 34. Write a Java program to Remove the given element from an ArrayList

import java.util.ArrayList;

public class arrayRemove_34 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        list.remove("C");

        System.out.println("After removing 'C': " + list);
    }
}
