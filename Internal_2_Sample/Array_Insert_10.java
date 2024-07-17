// 10. Write a Java program to insert an element into the array list at the first position
import java.util.ArrayList;
public class Array_Insert_10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        System.out.println("Original list: " + list);
        list.add(0, "White");
        System.out.println("List after inserting: " + list);
    }
}
