package multithreading;



class ThreadEx extends Thread{
int count=0;
	
	public void print() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<100;i++) {
			count++;
		}
		
	}
	public int getCount() {
		
		return count;
	}
	
	public void run() {
		
		print();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public interface ThreadExample2 {
public static void main(String[] args) throws InterruptedException {
	ThreadEx t=new ThreadEx();
	ThreadEx t2=new ThreadEx();
	t.setName("t");
	t2.setName("t2");
	t.start();
	t.join();
	t2.start();
	t2.join();

	System.out.println("count is "+t.getCount());
	
}
}
