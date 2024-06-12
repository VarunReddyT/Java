// 22. Write a Java program to Find minimum element in ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class arrayMin_22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // int min = list.get(0);
        // for(int i = 1;i<list.size();i++){
        //     if(list.get(i) < min){
        //         min = list.get(i);
        //     }
        // }

        int min = Collections.min(list);
        
        System.out.println("Min element: " + min);
    }
}
