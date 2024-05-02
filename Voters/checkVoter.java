import java.io.*;
import java.util.Scanner;
public class checkVoter {
    public static void main(String[] args) throws IOException{
        File f1 = new File("//run//media//varun-msi//Local Disk//Programming//Java//Voters","AllVoters.csv");
        File f2 = new File("//run//media//varun-msi//Local Disk//Programming//Java//Voters//Hyderabad","Voters.csv");
        
        FileReader f3 = new FileReader(f1);
        BufferedReader br = new BufferedReader(f3);

        FileWriter fw = new FileWriter(f2);

        String data = br.readLine();
        while(data != null){
            String[] L = data.split(",");
            if(Integer.parseInt(L[1])>=18){
                System.out.println(L[0]);
                fw.append(L[0]+","+L[1]+"\n");
            }
            data = br.readLine();
        }
        fw.close();
    }
}
