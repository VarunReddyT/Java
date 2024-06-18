import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
public class LLSort {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        Collections.sort(list);
        System.out.println(list); 
    }
}
