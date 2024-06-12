// 40. Write a Java program to check whether the given element is present in an ArrayList or not

import java.util.ArrayList;

public class arrayPresent_40 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original list: " + list);

        System.out.println(list.contains("C"));
        System.out.println(list.contains("F"));
    }
}
