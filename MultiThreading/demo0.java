class demo0 {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("thread1");
        System.out.println(t);
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("i = " + i);
        }
    }
}