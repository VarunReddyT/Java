// 37. Write a Java program to Retrieve a portion of an ArrayList

import java.util.ArrayList;

public class arrayRetrieve_37 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list.subList(1, 4));
    }
}
