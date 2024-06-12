// 18. Write a Java program to test an array list is empty or not

import java.util.ArrayList;

public class arrayEmptyCheck_18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.isEmpty());

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list.isEmpty());
    }
}
