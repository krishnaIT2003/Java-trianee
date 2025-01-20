package cj6;



public class ExceptionExample4 {
public static void main(String[] args) {
	try {
	Thread t=new Thread();
	t.setPriority(11);   // INVALID PRIORITY
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
}
}
