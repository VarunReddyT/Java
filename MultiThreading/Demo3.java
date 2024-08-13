class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Demo3 {
    public static void main(String args[]) {
        MyThread m = new MyThread();
        Thread t1 = new Thread(m);
        t1.start();
    }
}