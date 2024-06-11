// 15. Write a Java program to copy one array list into another

import java.util.ArrayList;

public class arrayCopy_15 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(1);
        list1.add(40);
        list1.add(2);
        list1.add(30);
        list1.add(3);
        list1.add(0);

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        System.out.println(list2);
    }
}
