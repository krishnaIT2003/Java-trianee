package cj6;

public class ThrowsExample {
	public void demo(int a) throws ArithmeticException{
		System.out.println(a);
	}
public static void main(String[] args) {
ThrowsExample te=new ThrowsExample();
try {
    int a = 10 / 0; // This will throw ArithmeticException
    te.demo(a);
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero is not allowed!");
}


}
}
