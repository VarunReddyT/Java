// 33. Write a Java program to Remove an element from a particular position of an ArrayList

import java.util.ArrayList;

public class arrayRemove_33 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        list.remove(2);

        System.out.println("After removing an element at index 2: " + list);
    }
}
