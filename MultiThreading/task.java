public class task implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
    public void run2(){
        for(int i=500;i<550;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
    public void run3(){
        for(int i=1000;i<1050;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        task c = new task();
        c.run();
        task c2 = new task();
        c2.run2();
        task c3 = new task();
        c3.run3();
    }
}
