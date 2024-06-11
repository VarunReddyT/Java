// 12. Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;

public class arrayRetrieve_12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        System.out.println(list.get(3));
    }
}
