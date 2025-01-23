package multithreading;

import java.util.concurrent.locks.ReentrantLock;

class SharedResource{
	 ReentrantLock lock1 = new ReentrantLock();
	    ReentrantLock lock2 = new ReentrantLock();
	    void method1(SharedResource resource2) {
	    boolean locked1 = false;
        boolean locked2 = false;

        try {
            locked1 = lock1.tryLock();
            if (locked1) {
                System.out.println(Thread.currentThread().getName() + " acquired lock1");

                // Try to acquire lock2 without blocking indefinitely
                locked2 = lock2.tryLock();
                if (locked2) {
                    System.out.println(Thread.currentThread().getName() + " acquired lock2");
                }
            }
            
        } 
        catch(Exception e) {
        System.out.println();
        }
        finally {
            if (locked1) lock1.unlock();
            if (locked2) lock2.unlock();
        }
    }
}
public class TryLockExample {
public static void main(String[] args) {
	SharedResource resource1 = new SharedResource();
	SharedResource resource2 = new SharedResource();

    // Thread 1
    Thread t1 = new Thread(() -> resource1.method1(resource2), "Thread-1");

    // Thread 2
    Thread t2 = new Thread(() -> resource2.method1(resource1), "Thread-2");

    // Start both threads
    t1.start();
    t2.start();
}
}
