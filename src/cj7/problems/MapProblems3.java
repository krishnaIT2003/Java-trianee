package cj7.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapProblems3 {
	
	public static Map<Character,Integer> sortByValueUsinTreemap(Map<Character,Integer>map){
	List<Map.Entry<Character,Integer>>list=new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
	
	list.sort(new Comparator<Map.Entry<Character, Integer>>() {

		@Override
		public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
			
			return o1.getValue().compareTo(o2.getValue());
		}
	});		
	
	 Map<Character, Integer> sortedMap = new LinkedHashMap<>();
	  for (Map.Entry<Character, Integer> entry : list) {
          sortedMap.put(entry.getKey(), entry.getValue());
      }
	  return sortedMap;
//return list.stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,
//		 LinkedHashMap::new));	
}
public static void main(String[] args) {
	Map<Character,Integer>map=new HashMap<Character, Integer>();
	map.put('a', 5);
	map.put('b',2);
	map.put('c', 8);
	map.put('d', 1);
	
	
	
}
}
