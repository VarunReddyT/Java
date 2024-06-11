 
// 16. Write a Java program to extract a portion of a array list

import java.util.ArrayList;

public class arrayExtract_16 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(40);
        list.add(2);
        list.add(30);
        list.add(3);
        list.add(0);

        ArrayList<Integer> subList = new ArrayList<>(list.subList(2, 5));

        System.out.println(subList);
    }
}
