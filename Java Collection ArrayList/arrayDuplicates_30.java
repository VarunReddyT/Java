// 30. Write a Java program to Remove Duplicates from ArrayList

import java.util.ArrayList;
import java.util.HashSet;

public class arrayDuplicates_30 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        System.out.println("Original list: " + list);

        // ArrayList<String> newList = new ArrayList<>();
        // for (String element : list) {
        //     if (!newList.contains(element)) {
        //         newList.add(element);
        //     }
        // }
        // System.out.println("List without duplicates: " + newList);

        HashSet<String> set = new HashSet<>(list);
        System.out.println("HashSet: " + set);
    

    }
}
