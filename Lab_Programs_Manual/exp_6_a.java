// 6. a. Write a java program that loads names and phone numbers from the text file into Hash Table where data is organized as one line per record and each field in record are separated by a tab(\t). It takes a name or phone number as input and prints the corresponding other value from hash table.
import java.util.*;
import java.io.*;

public class exp_6_a {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("PhoneBook.txt");
        BufferedReader br = new BufferedReader(fr);
        Hashtable<String,String> ht = new Hashtable<>();
        String line, name, mobile;
        while((line = br.readLine())!=null){
            String s[] = line.split("\\s+");
            ht.put(s[0], s[1]);
        }
        System.out.println(ht);
        System.out.println("Enter Name : ");
        name = sc.next();
        if(ht.containsKey(name)){
            System.out.println("Mobile Number is : "+ht.get(name));
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println("Enter Mobile Number : ");
        mobile = sc.next();
        if(ht.containsValue(mobile)){
            Set<Map.Entry<String,String>> s1 = ht.entrySet();
            for(Map.Entry<String,String> e : s1) {
                if(mobile.equals(e.getValue())){
                    System.out.println("Name is : " + e.getKey());
                }
            }  
        }
        else{
            System.out.println("Not Found");
        }
        br.close();
        sc.close();
    }
}
