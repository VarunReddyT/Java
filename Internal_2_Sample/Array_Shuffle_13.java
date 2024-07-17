// 13. Write a Java program to shuffle elements in a array list
import java.util.ArrayList;
import java.util.Collections;
public class Array_Shuffle_13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original list: " + list);
        Collections.shuffle(list);
        System.out.println("List after shuffling: " + list);
    }
}
