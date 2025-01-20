package cj7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
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
     
     
     for(Map.Entry<String, Integer>entry:map.entrySet()) {
    	 System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
     }
     
     //STREAMS
     map.forEach((n,v)->System.out.print(n+" "+v));
     
     //iterator
     Iterator<Integer>it=map.values().iterator();
 	while(it.hasNext()) {
 		System.out.println(it.next());
 	}

}
}
