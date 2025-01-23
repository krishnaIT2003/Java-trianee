package multithreading;

public class MyThread extends Thread{
public void run() {
	System.out.println("thread is running "+Thread.currentThread().getName());
}
}
