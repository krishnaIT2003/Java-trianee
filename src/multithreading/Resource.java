package multithreading;

public class Resource {

 void printNumbers() {
		for(int i=0;i<10;i++) {
			System.out.println(i+ "  thread name "+Thread.currentThread().getName());
		}
		
		
	}
	int count=0;
	void increment() {
		for(int i=0;i<1000;i++) {
			System.out.println("thread name is "+Thread.currentThread().getName()+" "+count);
			 synchronized (this) {
				 System.out.println(Thread.currentThread().getName());
		            count++;
		        }
			
		}
	}
	
	 int getCount() {
		return this.count;
	}
}
