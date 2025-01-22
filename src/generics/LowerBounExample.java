package generics;

//Lower bound - T must be a superclass of Integer
class IntegerBox<T> {
 public void printNumber(T number) {
     System.out.println("Number: " + number);
 }
}
public class LowerBounExample {
public static void main(String[] args) {
	   IntegerBox<? super Integer> box = new IntegerBox<>();
       box.printNumber(10);  // Valid, Integer is a subclass of Number
       // box.printNumber("Hello");  // Compile-time error
}
}
//the wildcard ? super Integer means that T can be of type Integer or any superclass of Integer (e.g., Number or Object).