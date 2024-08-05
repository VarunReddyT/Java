// 1. a. Given a number, check if the number (N) can be written as the form (k+1)*k. Write a java
// program to print those numbers in the given range.

import java.util.*;

public class exp_1_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i == (j+1)*j){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
