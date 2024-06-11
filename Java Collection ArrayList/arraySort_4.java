// 4. Write a Java program to sort a given array list


import java.util.ArrayList;
public class arraySort_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        list.sort(null);

        System.out.println(list);
    }
}
