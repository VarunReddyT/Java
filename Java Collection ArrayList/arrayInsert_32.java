// 32. Write a Java program to insert an element at a particular position of an ArrayList

import java.util.ArrayList;

public class arrayInsert_32 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        list.add(2, "F");

        System.out.println("After inserting an element at index 2: " + list);
    }    
}
