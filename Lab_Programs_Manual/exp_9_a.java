// 9. a. Write a java Program to write a method fCount which takes a string as a parameter. The Method fCount should return the Map which has the frequency count of the given word. For example if the string passed is “hello” the map should return {h-1,e-1,l-2,o-1}. The order of the characters should be same as in the string.
import java.util.*;
public class exp_9_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();

        Map<Character,Integer> result = new HashMap<>();
        result = fCount(s);
        System.out.println((result));
        sc.close();
    }
    public static Map<Character,Integer> fCount(String s){
        Map<Character,Integer> map = new LinkedHashMap<>(); // To maintain order of characters
        for(int i = 0;i<s.length();i++){
            int c = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i),c);
        }
        return map;
    }
}
