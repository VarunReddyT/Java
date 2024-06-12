// 25. Write a Java program how do you find the number of elements present in an ArrayList

import java.util.ArrayList;

public class arrayFind_25 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Number of elements in the list: " + list.size());
    }
}
