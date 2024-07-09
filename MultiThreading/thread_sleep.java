public class thread_sleep extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // the thread will sleep for the 2000 milli seconds or 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        thread_sleep t1 = new thread_sleep();
        thread_sleep t2 = new thread_sleep();

        t1.start();
        t2.start();
    }
}
