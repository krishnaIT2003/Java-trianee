package cj6;

public class ExceptionPropagationExample {
	
	static void method1() {
		System.out.println(10/0);
	}
	static void method2() {
		method1();
	}
	static void method3() {
		method2();
	}
public static void main(String[] args) {
	try {
		method3();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
