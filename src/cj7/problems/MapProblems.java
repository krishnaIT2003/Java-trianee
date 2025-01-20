package cj7.problems;

import java.util.HashMap;
import java.util.Map;

public class MapProblems {
	
	public static Map<String,Integer> countWordFreq(String arr[]){
		Map<String,Integer>map=new HashMap<String, Integer>();
		for(String word:arr) {
			int count=map.getOrDefault(word, 0);
			map.put(word, count+1);

		}
		return map;
	}
	
	
	public static Map<Character,Integer> findDuplicatesCharacters(String word) {
		Map<Character,Integer>map=new HashMap<Character, Integer>();
		for(Character ch:word.toCharArray()) {
			int count=map.getOrDefault(ch, 0);
			map.put(ch, count+1);
		}
		return map;
	}
	
	
public static void main(String[] args) {
	String arr[]= {"banana","apple","grapes","apple","orange","banana","apple"};
	Map<String,Integer>map=countWordFreq(arr);
	System.out.println(map);
	
	Map<Character,Integer>map2=findDuplicatesCharacters(arr[0]);
	System.out.println(map2);
}
}
