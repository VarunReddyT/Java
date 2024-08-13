class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread :" + i);
        }
    }
}

class Demo1 {
    public static void main(String args[]) {
        MyThread m = new MyThread();
        m.start();
    }
}