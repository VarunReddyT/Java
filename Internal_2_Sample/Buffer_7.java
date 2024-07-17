// 7. Create a BoundedBuffer class that extends Buffer and add a method to check if the buffer is full or empty without modifying the buffer itself. Use this method in the producer and consumer classes.
public class Buffer_7 {

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
        
        public synchronized void put(int data) {
            while (count == size) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer[in] = data;
            in = (in + 1) % size;
            count++;
            notifyAll();
        }
        
        public synchronized int get() {
            while (count == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int data = buffer[out];
            out = (out + 1) % size;
            count--;
            notifyAll();
            return data;
        }
        
        public synchronized boolean isFull() {
            return count == size;
        }
        
        public synchronized boolean isEmpty() {
            return count == 0;
        }
    }

    public static class Producer extends Thread {
        private BoundedBuffer buffer;
        
        public Producer(BoundedBuffer buffer) {
            this.buffer = buffer;
        }
        
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                buffer.put(i);
                System.out.println("Produced: " + i);
                System.out.println("Buffer is full: " + buffer.isFull());
            }
        }
    }

    public static class Consumer extends Thread {
        private BoundedBuffer buffer;
        
        public Consumer(BoundedBuffer buffer) {
            this.buffer = buffer;
        }
        
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int data = buffer.get();
                System.out.println("Consumed: " + data);
                System.out.println("Buffer is empty: " + buffer.isEmpty());
            }
        }
    }
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(5);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
    
}
