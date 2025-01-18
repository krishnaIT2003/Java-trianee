package cj6;

public class ExceptionExample {
public static void main(String[] args) {
	try {
		int a =2/0;
		System.out.println(a);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("i will excecute always ");
	}
}
}
