package cj7;

import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
TreeMap<String,Integer>map=new TreeMap<String, Integer>();
map.put("krishna", 1);
map.put("Bharath", 2);
map.put("prithvi", 3);
map.put("tharun", 4);
System.out.println(map);

System.out.println(map.firstKey());
System.out.println(map.lastKey());

System.out.println("Entries less than or equal to charlie: "+ map.headMap("prithvi",true));
System.out.println("entries greater than or equal to Bharath "+map.tailMap("krishna",true));
System.out.println("submap  "+map.subMap("Bharath", "prithvi"));



System.out.println("higher key "+map.higherKey("Bharath"));
System.out.println("last key "+map.lastKey());
System.out.println("lower key "+map.lowerKey("prithvi"));
	System.out.println(map.subMap("B", "t"));
	
}
}
