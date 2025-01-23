package multithreading;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
	System.out.println("this is a class implementing Runnable "+Thread.currentThread().getName());
		
	}

}
