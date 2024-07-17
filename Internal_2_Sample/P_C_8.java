// 8. Implement a stop method for both the Producer and Consumer classes that gracefully stops the threads after a certain number of items have been produced and consumed.

public class P_C_8 {

    public static class BoundedBuffer {
        private int[] buffer;
        private int size;
        private int in;
        private int out;
        private int count;
        
        public BoundedBuffer(int size) {
            this.size = size;
            buffer = new int[size];
            in = 0;
            out = 0;
            count = 0;
        }
        
        public synchronized void put(int data) throws InterruptedException {
            while (count == size) {
                wait();
            }
            buffer[in] = data;
            in = (in + 1) % size;
            count++;
            notifyAll();
        }
        
        public synchronized int get() throws InterruptedException {
            while (count == 0) {
                wait();
            }
            int data = buffer[out];
            out = (out + 1) % size;
            count--;
            notifyAll();
            return data;
        }
    }

    public static class Producer extends Thread {
        private BoundedBuffer buffer;
        private int maxCount;
        private volatile boolean running = true;
        
        public Producer(BoundedBuffer buffer, int maxCount) {
            this.buffer = buffer;
            this.maxCount = maxCount;
        }
        
        public void run() {
            try {
                for (int i = 0; i < maxCount && running; i++) {
                    buffer.put(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Producer running: " + running);
        }
        
        public void stopThread() {
            running = false;
            this.interrupt();
        }
    }

    public static class Consumer extends Thread {
        private BoundedBuffer buffer;
        private int maxCount;
        private volatile boolean running = true;
        
        public Consumer(BoundedBuffer buffer, int maxCount) {
            this.buffer = buffer;
            this.maxCount = maxCount;
        }
        
        public void run() {
            try {
                for (int i = 0; i < maxCount && running; i++) {
                    buffer.get();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Consumer running: " + running);
        }
        
        public void stopThread() {
            running = false;
            this.interrupt();
        }
    }

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10);
        Producer producer = new Producer(buffer, 5);
        Consumer consumer = new Consumer(buffer, 5);
        producer.start();
        consumer.start();
        
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Production and consumption completed.");
    }
}
