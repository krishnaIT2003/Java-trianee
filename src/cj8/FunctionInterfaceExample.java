package cj8;
@FunctionalInterface
interface Func{
	void add(int a,int b);
	default void display() {
		System.out.println("this is functional nterface");
	}
	static void print() {
		System.out.println("this is static method");
	}
}
public class FunctionInterfaceExample {
public static void main(String[] args) {
	Func c=(a,b)->System.out.println(a+b);
   c.add(8, 10);
   
   
}
}
