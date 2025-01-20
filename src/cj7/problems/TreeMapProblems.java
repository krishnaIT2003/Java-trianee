package cj7.problems;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapProblems {


	public static void main(String[] args) {
	Map<String,Integer>map=new TreeMap<>(Comparator.reverseOrder());
	 map.put("a", 5);
     map.put("b", 2);
     map.put("c", 8);
     map.put("d", 1);
     
     System.out.println(map);
}
}
