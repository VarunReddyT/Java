// 5. Write a Java program to shuffle elements in a array list

import java.util.ArrayList;
import java.util.Collections;

public class ArrayShuffle_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        Collections.shuffle(list);

        list.toArray();
        System.out.println(list);
        
    }
}
