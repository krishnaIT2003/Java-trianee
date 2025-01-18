package cj7;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);

   
    map.put("Alice", 30);
    map.put("Bob", 25);
    map.put("Charlie", 35);
    map.put("David", 40);
    System.out.println(map);
    map.get("Alice");
    map.get("Charlie");

    System.out.println("LinkedHashMap with access order: " + map);	
}
}
