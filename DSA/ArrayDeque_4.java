import java.util.*;

public class ArrayDeque_4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addFirst(34);
        list.addLast(40);
        list.add(30);    // By default add in rear
        list.addFirst(20);
        System.out.println(list);
    }
}
