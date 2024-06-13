// 19. Write a Java program to trim the capacity of an array list the current list size

import java.util.ArrayList;

public class arrayTrim_19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);
        System.out.println("Original list size: " + list.size());

        list.trimToSize();

        System.out.println("New list: " + list);
        System.out.println("New list size: " + list.size());

    }
}
