import java.util.*;

public class Stack_7 {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.push(30);        // If we use List interface, then this push method will not be available
        System.out.println(list);
    }
}
