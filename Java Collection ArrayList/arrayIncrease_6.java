// 6. Write a Java program to increase the size of an array list

import java.util.ArrayList;
public class arrayIncrease_6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        list.ensureCapacity(10);

        System.out.println(list.size());
    }
}
