// b. Write a program to find the most common words in the list of words given in sorted order based on occurrence from largest to smallest. If any of words are having same occurrence then consider the smallest character order comes first.
// Input format: First line contains the list of words and next line contains a number (k) which represent the top most words to display.
// Output format: display the k top most words.
import java.util.*;
public class exp_8_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int k = sc.nextInt();
        int count = 0;
        Map<String,Integer> freq = new HashMap<>();
        for(int i = 0;i<words.length;i++){
            int c = freq.getOrDefault(words[i],0) + 1;
            freq.put(words[i],c);
        }

        Map<String,Integer> frequencies = new TreeMap<>(new Comparator<String>() {
            public int compare(String k1, String k2){
                int cmp = freq.get(k2).compareTo(freq.get(k1));
                if(cmp == 0){
                    return k1.compareTo(k2);
                }
                else{
                    return cmp;
                }
            }
        });

        for(Map.Entry<String,Integer> m1 : freq.entrySet()){
            frequencies.put(m1.getKey(),m1.getValue());
        }

        for(Map.Entry<String,Integer> m1 : frequencies.entrySet()){
            System.out.print(m1.getKey()+" ");
            count++;
            if(count == k){
                break;
            }
        }
        sc.close();

    }
}
