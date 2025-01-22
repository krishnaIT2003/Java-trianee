package cj7;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<Integer, String>map=new HashMap<>();
	map.put(null, "Empty");
	map.put(9, "Ranjith");
	map.put(1, "krishna");
	map.put(2, "prithvi");
	map.put(3, "bharath");
	map.put(4, "tharun");
	System.out.println(map);
	System.out.println("contains key "+map.containsKey(1));
	System.out.println("contains value "+map.containsValue("krishna"));
	map.remove(null);
	System.out.println(map);
	for(Integer i:map.keySet()) {
		System.out.println(i);
	}
	for(String i:map.values()) {
		System.out.println(i);
	}
	
	for(Map.Entry<Integer, String>enry:map.entrySet()) {
		System.out.println(enry.getKey()+": "+enry.getValue());
		
	}
	map.compute(2, (key,value)->value==null?"demo":value+" hi");
	System.out.println(map);
	System.out.println(map.compute(9, (k,v)->v.toUpperCase()));
}
}
