package cj6;

public class ExceptionExample3 {
public static void main(String[] args) {
	String str = null;
    try {
        System.out.println(str.length()); // Accessing a method on null
    } catch (NullPointerException e) {
        System.out.println("Null pointer error: " + e.getMessage());
    }
}
}
