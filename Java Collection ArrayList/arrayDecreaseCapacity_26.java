// 26. Write a Java program how do you decrease the current capacity of an ArrayList to the current size

import java.util.ArrayList;

public class arrayDecreaseCapacity_26 {
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
