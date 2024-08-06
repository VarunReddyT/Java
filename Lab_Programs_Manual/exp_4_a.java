// 4. a. Given two strings text1 and text2, return the length of their longest common subsequence. A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings. If there is no common subsequence, return 0.

import java.util.*;
public class exp_4_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int m = 0,longLen = 0;
        for(int i = 0;i<s1.length();i++){
            for(int j = m;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    longLen += 1;
                    m = j+1;
                    break;
                }
            }
        }
        System.out.println("Length of longest substring : " + longLen);
    }
}
