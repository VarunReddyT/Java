// 10. Write a Java program to join two array lists

import java.util.ArrayList;
public class arrayJoin_10 {
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

        list1.addAll(list2);

        System.out.println(list1);
    }
}
