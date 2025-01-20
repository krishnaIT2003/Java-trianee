package cj8;


@FunctionalInterface
interface Calculator{
 int calculate(int a,int b);
}


public class FunctionalInterfaceExample {
public static void main(String[] args) {
	Calculator c=new Calculator() {
		
		@Override
		public int calculate(int a, int b) {
			
			return a+b;
		}
	};
}
}
