// 12. Write a Java program to sort a given array list
import java.util.ArrayList;
public class Array_Sort_12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original list: " + list);
        list.sort(null);
        System.out.println("List after sorting: " + list);
    }
}
