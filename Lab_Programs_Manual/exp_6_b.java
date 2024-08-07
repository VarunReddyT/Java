// b. You have created a web-based survey of favorite programming languages and are capturing the results into a text file named “logfile”.
// The logfile is ordered by increasing timestamp. You are concerned that some people are voting multiple times for the same item. To somewhat address this problem, throw out any new votes for the same item that come from the same IP address within 20 seconds.
// In the above example, the second and last votes for PHP would be thrown out because they are for the same item from the same IP address and occur within 20 seconds of other PHP votes from the same IP address. However, the PHP vote from 128.120.56.214 would be retained since there is not another PHP vote from this IP address.
// Write a Java program to count the votes from the logfile, throwing out duplicate votes using the rules above. Display the votes in a table, as shown below for the example:
// PHP 2 
// C# 1
// Prolog 1
import java.util.*;
import java.io.*;
public class exp_6_b {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("logfile.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        

        ArrayList<Data> arr = new ArrayList<>();
        while((line = br.readLine())!=null){
            String[] data = new String[3];
            data[0] = line;
            data[1] = br.readLine();
            data[2] = br.readLine();
            Data d = new Data(data[0],data[1],data[2]);
            arr.add(d);
        }
        System.out.println("File Content : ");
        for(Data i : arr){
            System.out.println(i.progLang + " " + i.ip + " " + i.timeStamp);
        }
        int time1, time2;
        int n = arr.size();
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr.get(i).progLang.equals(arr.get(j).progLang) && arr.get(i).ip.equals(arr.get(j).ip)){
                    time1 = Integer.parseInt(arr.get(i).timeStamp);
                    time2 = Integer.parseInt(arr.get(j).timeStamp);
                    if(time2-time1 <= 20){
                        arr.remove(j);
                        n -= 1;
                    }
                }
            }
        }
        HashMap<String,Integer> freq = new HashMap<>();
        for(Data i : arr){
            int c = freq.getOrDefault(i.progLang,0)+1;
            freq.put(i.progLang,c);
        }
        System.out.println("Votes : ");
        for(Map.Entry<String,Integer> m1 : freq.entrySet()){
            System.out.println(m1.getKey() + " " + m1.getValue());
        }
        sc.close();
        br.close();
    }   
}

class Data{
    String progLang, ip, timeStamp;
    Data(String progLang, String ip, String timeStamp){
        this.progLang = progLang;
        this.ip = ip;
        this.timeStamp = timeStamp;
    }
}