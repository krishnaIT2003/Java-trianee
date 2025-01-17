package cj4;

class Parent {
    static void show() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void show() { // Hides the Parent's static method
        System.out.println("Static method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        obj1.show(); // Output: Static method in Parent class
        obj2.show(); // Output: Static method in Parent class (method hiding, not overriding)
    }
}
