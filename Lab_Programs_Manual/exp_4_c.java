// c. You are given a string S of alphabet characters and the task is to find its matching decimal representation as on the shown keypad. Output the decimal representation corresponding to the string. 
// For ex: if you are given “amazon” then its corresponding decimal representation will be 262966.

import java.util.*;
public class exp_4_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i = 0;i<n;i++){
            switch (str.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print("2");
                    break;            
                case 'd':
                case 'e':
                case 'f':
                    System.out.print("3");
                    break;            
                case 'g':
                case 'h':
                case 'i':
                    System.out.print("4");
                    break;            
                case 'j':
                case 'k':
                case 'l':
                    System.out.print("5");
                    break;            
                case 'm':
                case 'n':
                case 'o':
                    System.out.print("6");
                    break;            
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print("7");
                    break;            
                case 't':
                case 'u':
                case 'v':
                    System.out.print("8");
                    break;            
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print("9");
                    break;            
                default:
                System.exit(0);
                    break;
            }
        }
        sc.close();
    }
}
