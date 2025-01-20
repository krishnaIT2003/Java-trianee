package cj7;

import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	Vector<Integer> vector = new Vector<>(5);

    
    vector.add(10);
    vector.add(20);
    vector.add(30);

 
    System.out.println("Size: " + vector.size());
    System.out.println("Capacity: " + vector.capacity());

  
    vector.add(40);
    vector.add(50);
    vector.add(60);

    System.out.println("Size after adding more elements: " + vector.size());
    System.out.println("Capacity after adding more elements: " + vector.capacity());
}
}
