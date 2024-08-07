// b. When working with HashMaps, sometimes cases arise where we wish to determine if two HashMaps have any key/value pairs in common. For example, we might have the following two Hashmaps (named hashmap1 and hashmap2, respectively) that map from String to String (i.e., their type is HashMap) and we want to count how many key/value pairs they have in common.
// In the example above, these two HashMaps have two key/value pairs in common, namely: "Mary"/"Ecstatic" and "Bob"/"Happy". Note that although the key "Felix" is in both HashMaps, the associated value with this key is different in the two maps (hence this does not count as a key/value pair that is common to both HashMaps). Similarly, just having the same value without the same key (such as the value "Fine" which is mapped to by different keys in the two different HashMaps) would also not count as a common key/value pair between the two HashMaps.
import java.util.*;
public class exp_9_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> h1 = new HashMap<>();
        HashMap<String,String> h2 = new HashMap<>();

        System.out.println("Enter number of pairs in 1st hashmap : ");
        int h1size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter pairs of 1st hashmap : ");
        for(int i = 0;i<h1size;i++){
            System.out.println("Enter Pair "+(i+1));
            String pairs[] = sc.nextLine().split(" ");
            h1.put(pairs[0],pairs[1]);
        }
        System.out.println("Enter number of pairs in 2nd hashmap : ");
        int h2size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter pairs of 2nd hashmap : ");
        for(int i = 0;i<h2size;i++){
            System.out.println("Enter Pair "+(i+1));
            String pairs[] = sc.nextLine().split(" ");
            h2.put(pairs[0],pairs[1]);
        }

        System.out.println("Number of common key value pairs : " + commonKeyValuePairs(h1, h2));

        sc.close();
    }
    public static int commonKeyValuePairs(HashMap<String,String> h1, HashMap<String,String> h2){
        int count = 0;
        for(Map.Entry<String,String> m1 : h1.entrySet()){
            for(Map.Entry<String,String> m2 : h2.entrySet()){
                if(m1.getKey().equals(m2.getKey()) && m1.getValue().equals(m2.getValue())){
                    count++;
                }
            }
        }
        return count;
    }
}
