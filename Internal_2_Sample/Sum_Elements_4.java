// 4. Write a method that takes a List<Double> and returns the sum of its elements, demonstrating auto boxing and unboxing.

import java.util.ArrayList;
public class Sum_Elements_4 {
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(1.0);
        list.add(2.0);

        // Auto boxing
        // primitive double is converted to Double object
        
        double d = 3.0;
        list.add(d);
        list.add(4.0);
        list.add(5.0);
        System.out.println(sum(list));
    }
}
