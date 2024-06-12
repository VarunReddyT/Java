// 35. Write a Java program to Remove all elements of an ArrayList at a time

import java.util.ArrayList;

public class arrayRemoveAll_35 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        list.clear();

        System.out.println("After removing all elements: " + list);
    }
}
