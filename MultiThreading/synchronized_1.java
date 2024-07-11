public class synchronized_1 extends Thread {
    synchronized public void run(){
        for(int i = 0;i<20;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        synchronized_1 s = new synchronized_1();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
        System.out.println("Hello");
    }
}
