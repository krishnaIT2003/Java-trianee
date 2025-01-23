package multithreading;

class Resources {
    synchronized void method1(Resources r) {
        System.out.println(Thread.currentThread().getName() + " is using method1");
        try { Thread.sleep(100); } catch (InterruptedException e) { }
        r.method2(); // Calling method2 on the other resource
    }

    synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " is using method2");
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
        Resources resource1 = new Resources();
        Resources resource2 = new Resources();

        // Thread 1: Holds resource1 and waits for resource2
        Thread t1 = new Thread(() -> resource1.method1(resource2), "Thread-1");

        // Thread 2: Holds resource2 and waits for resource1
        Thread t2 = new Thread(() -> resource2.method1(resource1), "Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
