class Demo4 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.print("\nChild thread : " + i);
    }

    public static void main(String[] args) {
        Demo4 t1 = new Demo4();
        t1.setPriority(10);
        t1.start();
        Thread.currentThread().setPriority(1);
        for (int i = 1; i <= 10; i++)
            System.out.print("\nMain thread :" + i);
    }
}