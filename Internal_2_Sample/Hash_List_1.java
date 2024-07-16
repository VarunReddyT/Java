// 1. Write a Java program to iterate through all elements in a hash list.

import java.util.HashSet;

public class Hash_List_1 {
    public static void main(String[] args) {
        HashSet<String> hashList = new HashSet<String>();
        hashList.add("Red");
        hashList.add("Green");
        hashList.add("Blue");
        hashList.add("Yellow");
        hashList.add("Black");
        hashList.add("White");

        for (String element : hashList) {
            System.out.println(element);
        }
    }
}
