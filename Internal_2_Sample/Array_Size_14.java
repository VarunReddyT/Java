// 14. Write a Java program to increase the size of an array list
import java.util.ArrayList;
public class Array_Size_14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        System.out.println("Original list: " + list);
        list.ensureCapacity(10);
        System.out.println("List after increasing size: " + list);
    }
}
