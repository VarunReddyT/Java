// 24. Write a Java program to Searching for elements in an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class arraySearch_24 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        System.out.println(Collections.binarySearch(list,"C"));
        System.out.println(list.indexOf("C"));
    }
}
