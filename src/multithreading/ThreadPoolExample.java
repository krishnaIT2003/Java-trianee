package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(3);
	
	for(int i=0;i<50;i++) {
		final int taskId=i;
		executor.execute(()->System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName()));
	}
}
}
