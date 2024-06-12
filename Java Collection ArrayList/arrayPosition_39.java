// 39. Write a Java program to get the position of a particular element in an ArrayList

import java.util.ArrayList;

public class arrayPosition_39 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        int index = list.indexOf("C");

        System.out.println("Index of C : " + index);
    }
}
