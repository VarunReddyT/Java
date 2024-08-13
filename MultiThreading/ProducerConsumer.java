class Buffer {
    int a;
    boolean produced = false;

    public synchronized void produce(int x) {
        while (produced) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        a = x;
        System.out.println("Product " + a + " is produced.");
        produced = true;
        notify();
    }

    public synchronized void consume() {
        while (!produced) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Product " + a + " is consumed.");
        produced = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    public Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        System.out.println("Producer start producing...");
        for (int i = 1; i <= 10; i++) {
            b.produce(i);
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    public Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        System.out.println("Consumer start synchronized consuming...");
        for (int i = 1; i <= 10; i++) {
            b.consume();
        }
    }
}

public class ProducerConsumer {
    public static void main(String args[]) {

        Buffer b = new Buffer();

        Producer p = new Producer(b);

        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}