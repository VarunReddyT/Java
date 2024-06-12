// 20. Write a Java program to print all the elements of a Array List using the position of the elements

import java.util.ArrayList;

public class arrayPrint_20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
