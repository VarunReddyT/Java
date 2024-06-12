// 21. Write a Java program to Find maximum element in ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class arrayMax_21 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // int max = list.get(0);
        // for(int i = 1;i<list.size();i++){
        //     if(list.get(i) > max){
        //         max = list.get(i);
        //     }
        // }

        int max = Collections.max(list);
        
        System.out.println("Max element: " + max);
    }
}
