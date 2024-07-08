// MultiThreading is a process of executing multiple threads simultaneously.
// Thread is a lightweight sub-process, the smallest unit of processing.
// Multiprocessing and multithreading, both are used to achieve multitasking.
// But we use multithreading than multiprocessing because threads share a common memory area.
// They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

// States of Thread:
// 1. New: The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
// 2. Runnable: The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
// 3. Running: The thread is in running state if the thread scheduler has selected it.
// 4. Blocked/Waiting: The thread is in blocked state if it is waiting for a monitor lock to enter a synchronized block/method or waiting for join() method to complete.
// 5. Dead: A thread is in dead state if the run() method has completed.

public class intro extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        intro t1 = new intro();
        t1.start();
    }
}

// When you call t1.start(), JVM creates a new thread and then calls the thread's run() method.