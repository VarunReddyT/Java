// 5. Write a program to read a list of integers from the console until a non-integer input is entered. Use the Scanner class.

import java.util.Scanner;
public class Input_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers: ");
        while(sc.hasNextInt()){
            sc.nextInt();
        }
        sc.close();

    }
}
