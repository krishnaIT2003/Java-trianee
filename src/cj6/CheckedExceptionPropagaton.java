package cj6;

import java.io.IOException;

public class CheckedExceptionPropagaton {
	
	static void method1() throws IOException{
		throw new IOException("file not found");
	}
	static void method2() throws IOException {
		method1();
	}
	static void method3() throws IOException {
		method2();
	}
public static void main(String[] args) {
try {
	method3();
} catch (IOException e) {
	
	e.printStackTrace();
}	
}
}
