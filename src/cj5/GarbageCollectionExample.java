package cj5;

public class GarbageCollectionExample {
	
	public void display() {
		System.out.println("hi bros");
	}
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
public static void main(String[] args) {
	GarbageCollectionExample obj1=new GarbageCollectionExample();
	GarbageCollectionExample obj2=new GarbageCollectionExample();
	obj1.display();
	obj2.display();
	obj1=null;
	
	System.gc();
	System.out.println("obj1 cleaned");
System.out.println(obj2);
	System.out.println("Garbage Collection requested");
	obj2=null;
}
}
