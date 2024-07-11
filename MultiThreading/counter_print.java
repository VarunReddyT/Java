public class counter_print implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        counter_print c = new counter_print();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}