// 7. Write a Java program to reverse elements in a array list

import java.util.ArrayList;
import java.util.Collections;
public class arrayReverse_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        Collections.reverse(list);

        System.out.println(list);
    }
}
