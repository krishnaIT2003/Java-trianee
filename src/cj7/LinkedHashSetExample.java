package cj7;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate, won't be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Checking if an element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // Removing an element
        set.remove("Cherry");
        System.out.println("After removal: " + set);

        // Iterating over the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clearing the LinkedHashSet
        set.clear();
        System.out.println("After clearing: " + set);
    }
}

