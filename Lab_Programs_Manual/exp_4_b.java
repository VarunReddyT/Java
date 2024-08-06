// b. Given two strings s1 and s2, your task is to merge those strings to form a new merged string. A merge operation on two strings is described as follows:
// Append alternating characters from s1 and s2, respectively, to mergedString. Once all of the characters in one of the strings have been merged, append the remaining characters in the other string to mergedString.
import java.util.*;
public class exp_4_b {
    public static void main(String[] args) {
        String s = "";
        int i = 0,j = 0;
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        while(i<s1.length() && j<s2.length()){
            s += s1.charAt(i)+""+s2.charAt(j);
            i++;
            j++;
        }
        while(i<s1.length()){
            s += s1.charAt(i);
            i++;
        }
        while(j<s2.length()){
            s += s2.charAt(j);
            j++;
        }
        System.out.println(s);
        sc.close();
    }    
}
