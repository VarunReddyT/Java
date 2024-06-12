// 31. Write a Java program to Convert an ArrayList to Array

import java.util.ArrayList;

public class arrayConvert_31 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        String[] array = new String[list.size()];
        list.toArray(array);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
