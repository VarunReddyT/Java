import java.util.ArrayList;
public class arrayDelete_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        list.remove(4);

        System.out.println(list);
    }
}
