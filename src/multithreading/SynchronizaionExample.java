package multithreading;


class MyThread1 extends Thread{
	Resource resource;
	public MyThread1(Resource resource) {
		this.resource=resource;
	}
	public void run() {
		resource.increment();
	}
	
	
}
public class SynchronizaionExample {
public static void main(String[] args) throws InterruptedException {
	Resource r=new Resource();
	MyThread1 t1=new MyThread1(r);
	MyThread1 t2=new MyThread1(r);
	t1.setName("T1");
	t2.setName("T2");
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(r.getCount());
}
}
