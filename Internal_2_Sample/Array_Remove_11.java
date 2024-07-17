// 11. Write a Java program to remove the fifth element from a array list
import java.util.ArrayList;
public class Array_Remove_11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original list: " + list);
        list.remove(4);
        System.out.println("List after removing the fifth element: " + list);
    }
}
