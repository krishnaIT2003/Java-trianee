package cj7;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
       
        Hashtable<String, Integer> hashtable = new Hashtable<>();

     
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);

      
        System.out.println("Hashtable: " + hashtable);

  
        System.out.println("Contains key 'Banana'? " + hashtable.containsKey("Banana"));

   
        System.out.println("Contains value 2? " + hashtable.containsValue(2));

        System.out.println("Value for key 'Apple': " + hashtable.get("Apple"));

     
        hashtable.remove("Cherry");
        System.out.println("After removal: " + hashtable);

   
        System.out.println("Iterating over Hashtable:");
        hashtable.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
        hashtable.clear();
        System.out.println("After clearing: " + hashtable);
    }
}
