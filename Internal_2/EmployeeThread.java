
import java.io.*;
import java.util.*;

class Writer implements Runnable{
    @Override
    public void run(){
        try(FileWriter fw = new FileWriter("employee.csv",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw))
        {
            out.println("Bob"+","+38+","+1500000);
            System.out.println("Employee added : ");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


// class emp implements Comparable<emp>{
//     public
//     String name;
//     int age;
//     int salary;
//     emp(String name,int age, int salary){
//         this.name = name;
//         this.age = age;
//         this.salary = salary;
//     }

//     @Override
//     public String compareTo(emp o){
//         return this.name.compareTo(o.name);
//     }

//     @Override
//     public String toString(){
//         return "Employee{"+ "name=" + name + '\''+"age=" + age + "salary=" + salary +"}";
//     }

// }

class emp1 implements Comparable<emp1>{
    public
    String name;
    int age;
    int salary;
    emp1(String name,int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(emp1 o){
        return this.salary - o.salary;
    }

    @Override
    public String toString(){
        return "Employee{"+ "name=" + name + '\''+"age=" + age + "salary=" + salary +"}";
    }

}


// class NameSorter implements Runnable{
//     @Override
//     public void run(){
//         try(FileReader f = new FileReader("reports.csv");
//         BufferedReader b = new BufferedReader(f)){
//             List<emp> l = new ArrayList<emp>();
//             while(b.readLine()!=null){
//                 String line = new String(b.readLine());
//                 String words[] = line.split(",");
//                 emp e = new emp(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2]));
//                 l.add(e);
//             }
//             Collections.sort(l);

//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//     }

// }

class AgeSorter implements Runnable{
    @Override
    public void run(){
        try(FileReader f = new FileReader("employee.csv");
        BufferedReader b = new BufferedReader(f)){
            List<emp1> l = new ArrayList<emp1>();
            while(b.readLine()!=null){
                String line = new String(b.readLine());
                System.out.println(line);
                String words[] = line.split(",");
                emp1 e = new emp1(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2]));
                l.add(e);
            }
            Collections.sort(l);
            System.out.println(l);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}

public class EmployeeThread {
    public static void main(String[] args) throws InterruptedException {
        Writer w = new Writer();
        // NameSorter s1 = new NameSorter();
        AgeSorter s2 = new AgeSorter();

        Thread t = new Thread(w);
        // Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t.start();
        t.join();
        // t1.start();
        t2.start();
    }
    
}
