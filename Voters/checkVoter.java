import java.io.*;
import java.util.Scanner;
public class checkVoter {
    public static void main(String[] args) throws IOException{
        File f = new File("//run//media//varun-msi//Local Disk//Programming//Java//Voters//Hyderabad");
        f.mkdir();
        File f2 = new File(f,"Voters.txt");
        f2.createNewFile();
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter(f2);
        for(int i = 0;i<5;i++){
            String name = scanner.next();
            int age = scanner.nextInt();
            if(age<18){
                System.out.println("You are below 18. Cannot vote !");
            }
            else{
                fw.append(name+" "+age+"\n");
            }
        }
        fw.close();
    }
}
