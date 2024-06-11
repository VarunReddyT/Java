// 11. Write a Java program to empty an array list

import java.util.ArrayList;

public class arrayEmpty_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        list.clear();

        System.out.println(list);
    }
}
