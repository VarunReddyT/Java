// b. Write a java program to check whether the given number is gapful or not.
// A number is gapful if it is at least 3 digits long and is divisible by the number formed by stringing the
// first and last numbers together. The smallest number that fits this description is 100. First digit is 1, last
// digit is 0, forming 10, which is a factor of 100. Therefore, 100 is gapful. Print “Yes” if it is gapful
// otherwise “No”.

import java.util.Scanner;

public class exp_1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int l = s1.length();
        String s2 = s1.charAt(0)+""+s1.charAt(l-1);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        if(l<3){
            System.out.println("No");
        }
        else{
            if(n1%n2 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
