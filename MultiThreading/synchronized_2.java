// public class synchronized_2 extends Thread{
//     public class Employee{
//         synchronized void run(){
//             System.out.println("Employee");
//         }
//     }
//     public class Manager{
//         synchronized void run(){
//             System.out.println("Manager");
//         }
//     }
//     public static void main(String[] args){
//         synchronized_2 obj = new synchronized_2();
//         Employee e = obj.new Employee();
//         Manager m = obj.new Manager();

//         Thread t1 = new Thread((Runnable) e);
//         Thread t2 = new Thread((Runnable) m);

//         t1.start();
//         t2.start();
        
//     }
// }
