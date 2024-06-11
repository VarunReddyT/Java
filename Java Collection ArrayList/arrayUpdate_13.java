// 13. Write a Java program to update specific array element by given element

import java.util.ArrayList;

public class arrayUpdate_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        list.set(3, 100);

        System.out.println(list);
    }
}
