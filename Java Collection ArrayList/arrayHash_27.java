// 27. Write a Java program how to Convert a ArrayList to HashSet

import java.util.ArrayList;
import java.util.HashSet;

public class arrayHash_27 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        System.out.println("Original list: " + list);

        HashSet<String> set = new HashSet<>(list);

        System.out.println("HashSet: " + set);
    }
}
