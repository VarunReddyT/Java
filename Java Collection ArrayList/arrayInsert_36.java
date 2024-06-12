// 36. Write a Java program to Insert more than one element at a particular position of an ArrayList

import java.util.ArrayList;

public class arrayInsert_36 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        list.add(2, "F");
        list.add(2, "G");
        list.add(2, "H");

        System.out.println("After inserting elements at index 2: " + list);
    }
}
