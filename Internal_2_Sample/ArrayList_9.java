// 9. Write a Java program to create a new array list, add some elements (string) and print out the collection
import java.util.ArrayList;
public class ArrayList_9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
    }
}
