package collections.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadOnlyData {
	

public static void main(String[] args) {
	List<String> immutableList = List.of("Dog", "Cat", "Rabbit");
    System.out.println("Immutable List: " + immutableList);
    Set<String>immutableSet=Set.of("krishna","prithvi");
    immutableSet.add("yoy");  //cant add 
	System.out.println("imutable set "+immutableSet);
	
	Map<Integer,String>immutableMap=Map.of(1,"krishna",2,"ajay");
	System.out.println("immutable map"+immutableMap);
}
}
