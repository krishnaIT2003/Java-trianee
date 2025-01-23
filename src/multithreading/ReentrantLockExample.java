package multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Source{
	private final ReentrantLock lock=new ReentrantLock();
	public void acessResource() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " is accessing the resource");
			 Thread.sleep(1000); 
		}
		catch (InterruptedException e) {
            e.printStackTrace();
        } 
		finally{
		lock.unlock();
		System.out.println(Thread.currentThread().getName()+" released the lock");
		}
	}
}
public class ReentrantLockExample {
	
public static void main(String[] args) {
	Source source=new Source();
	Runnable Task=source::acessResource;
	Thread t1=new Thread(Task,"thread1");
	Thread t2=new Thread(Task,"thread2");
	t1.start();
	t2.start();
}
}
