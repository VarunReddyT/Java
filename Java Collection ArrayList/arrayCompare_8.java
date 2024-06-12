// 8. Write a Java program to compare two array lists

import java.util.ArrayList;

public class arrayCompare_8 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(1);
        list1.add(40);
        list1.add(2);
        list1.add(30);
        list1.add(3);
        list1.add(0);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(1);
        list2.add(40);
        list2.add(2);
        list2.add(30);
        list2.add(3);
        list2.add(0);

        System.out.println(list1.equals(list2));
    }
}
