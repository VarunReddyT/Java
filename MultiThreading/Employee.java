import java.io.*;
import java.lang.*;

class emp extends Thread {

    String[] name = { "Varun", "Shiva", "Deepak", "Manoj", "Charan" };
    int[] salary = { 90000, 65000, 100000, 65000, 70000 };
    int[] year = { 2010, 2012, 2014, 2016, 2018 };

    @Override
    public void run(){
        // TODO Auto-generated method stub
        
        FileWriter fw;
        BufferedWriter bw;
        try{
         fw = new FileWriter("employee.csv");
        bw = new BufferedWriter(fw);
        bw.write("name,salary,year");
        bw.newLine();
        for (int i = 0; i < 5; i++) {
            bw.write(name[i]+","+salary[i]+","+year[i]);
            bw.newLine();
        }
        bw.close();
        fw.close();

        System.out.println("The data inside the file is written successfully");
        System.out.println("The data  :");
        FileReader fr = new FileReader("employee.csv");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
        catch(Exception e){
            System.out.println("error in file creation");
        }  
    }
}

class sort extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        try {
            FileReader fr = new FileReader("employee.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String[] data = new String[3];
            int[] salary = new int[5];
            String[] name = new String[5];
            int[] year = new int[5];
            int i = 0;
            while ((line = br.readLine()) != null) {
                data = line.split(",");
                name[i] = data[0];
                salary[i] = Integer.parseInt(data[1]);
                year[i] = Integer.parseInt(data[2]);
                i++;
            }
            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    if (salary[j] > salary[k]) {
                        int temp = salary[j];
                        salary[j] = salary[k];
                        salary[k] = temp;
                        String temp1 = name[j];
                        name[j] = name[k];
                        name[k] = temp1;
                        int temp2 = year[j];
                        year[j] = year[k];
                        year[k] = temp2;
                    }
                }
            }
            FileWriter fw = new FileWriter("sortedEmployee.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("name,salary,year");
            bw.newLine();
            for (int j = 0; j < 5; j++) {
                bw.write(name[j] + "," + salary[j] + "," + year[j]);
                bw.newLine();
            }
            bw.close();
            fw.close();
            br.close();
            fr.close();

            System.out.println("\nThe sorted data  :");
         fr = new FileReader("sortedEmployee.csv");
        br = new BufferedReader(fr);
        line = br.readLine();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        } catch (Exception e) {
            System.out.println("error in file reading");
        }
    }

}
public class Employee {

    public static void main(String[] args) throws IOException , InterruptedException {
        emp e = new emp();
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(new sort());
        t1.start();
        t1.join();
        t2.start();

    }

}