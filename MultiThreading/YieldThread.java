// public class YieldThread extends Thread {

//     public void run() {
//         for (int i = 0; i < 20; i++) {
//             if (i == 11) {
//                 Thread.currentThread().yield();
//             }
//             System.out.println(i + " " + Thread.currentThread().getName());
//         }
//     }

//     public static void main(String[] args) {
//         YieldThread t = new YieldThread();
//         Thread t1 = new Thread(t);
//         Thread t2 = new Thread(t);
//         t1.start();
//         t2.start();
//     }
// }
