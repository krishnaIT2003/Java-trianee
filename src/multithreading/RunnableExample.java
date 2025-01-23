package multithreading;

public class RunnableExample {
public static void main(String[] args) {
//	MyRunnable r=new MyRunnable();
//	Thread t=new Thread(r);
	Thread t=new Thread(new MyRunnable());
	t.start();
}
}
