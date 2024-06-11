// 2. Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;
public class arrayInsert_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.add(0, "E");

        System.out.println(list);
    }
}
