package cj7.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapProblems2 {
	public static Map<Integer,Integer> groupElementsByFrequency(int nums[]){
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		
		for(int i:nums) {
			int count=map.getOrDefault(i, 0);
			map.put(i, count+1);
		}
		return map;
	}
	
	public static Map<Character,Integer> sortByValue(Map<Character,Integer>map){
		Map<Character,Integer>sortedMap=new LinkedHashMap<Character, Integer>();
	List<Map.Entry<Character,Integer>>list=new ArrayList<>(map.entrySet());
	list.sort(Map.Entry.comparingByValue());
		for(Map.Entry<Character, Integer>entry:list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
public static void main(String[] args) {
	int nums[]= {1,2,2,3,3,3,4};
	Map<Integer,Integer>map1=groupElementsByFrequency(nums);
	System.out.println(map1);
Map<Character,Integer>map2=new HashMap<Character, Integer>();
map2.put('a', 5);
map2.put('b',2);
map2.put('c', 8);
map2.put('d', 1);

Map<Character,Integer>sortedMap=sortByValue(map2);
System.out.println(sortedMap);
}
}
