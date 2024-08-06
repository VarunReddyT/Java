// 3. a. Given an array arr[] of N integers, the task is to find the maximum difference between any two elements of the array.

import java.util.*;
public class exp_3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[1];
        for(int i = 0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            else if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max-min);
    }
}
