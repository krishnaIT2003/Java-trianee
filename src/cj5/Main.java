package cj5;

interface Calculator {
    static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator.add(5, 10); // Calls static method
    }
}
