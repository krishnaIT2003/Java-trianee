package cj7;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCompartorExample {
public static void main(String[] args) {
	Comparator<String>custom=(key1,key2)->key2.compareTo(key1);
	TreeMap<String,Integer>map=new TreeMap<>(custom);
	 map.put("Alice", 30);
     map.put("Bob", 25);
     map.put("Krishna", 15);
     map.put("Charlie", 35);
     System.out.println(map);
}
}
