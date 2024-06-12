// 29. Write a Java program to get SubList from ArrayList

import java.util.ArrayList;

public class arraySubList_29 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);
        System.out.println("Sub list: " + list.subList(1, 4));
    }
}
