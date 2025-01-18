package cj5;

public class GarbageCollectionExample {
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
public static void main(String[] args) {
	GarbageCollectionExample obj1=new GarbageCollectionExample();
	GarbageCollectionExample obj2=new GarbageCollectionExample();
	obj1=null;
	obj2=null;
	System.gc();
	System.out.println("Garbage Collection requested");
}
}
