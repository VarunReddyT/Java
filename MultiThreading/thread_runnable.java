class thread_runnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String args[]) {
        thread_runnable m1 = new thread_runnable();
        Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
        t1.start();
    }
}