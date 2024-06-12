// 38. Write a Java program to Replace a particular element in an ArrayList with the given element

import java.util.ArrayList;

public class arrayReplace_38 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        list.set(2, "F");

        System.out.println("After replacing an element at index 2: " + list);
    }
}
