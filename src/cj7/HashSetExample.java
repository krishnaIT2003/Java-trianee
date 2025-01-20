package cj7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		set.add("krishna");
		set.add("shiva");
		set.add("sudheer");
		set.add("shiva");
		set.add("Sudheer");
		System.out.println(set);
		
		
		for(String str:set) {
			System.out.println(str);
		}
		set.iterator().forEachRemaining(System.out::println);
		set.stream().
		map(String::toUpperCase).
		distinct().
		forEach(System.out::println);
		
		
	}
}
