// 1. Write a Java program to create a new array list, add some elements (string) and print out the collection


import java.util.ArrayList;

public class arrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
    }
}
