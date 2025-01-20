package cj7.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProblem {
	
	public static List<Integer> reverse(List<Integer>list){
		return list.stream().sorted((e1,e2)->e2.compareTo(e1)).toList();
	}
	
	public static LinkedList<Integer>  removeDuplicates(LinkedList<Integer>list){
		return list.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
	}
	
	public static LinkedList<Integer>  removeDuplicatesApproach2(LinkedList<Integer>list) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i:list) {
			if(!set.contains(i)) {
				set.add(i);
			}
		}
		return set.stream().collect(Collectors.toCollection(LinkedList::new));
	}
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
List<Integer>reverseList=reverse(list);
System.out.println(reverseList);

LinkedList<Integer>linkList=new LinkedList<Integer>(Arrays.asList(1,2,3,2,4,5,3));
System.out.println(removeDuplicates(linkList));
System.out.println(removeDuplicatesApproach2(linkList));
}
}
