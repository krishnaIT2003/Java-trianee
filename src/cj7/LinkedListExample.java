package cj7;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<Integer>list=new LinkedList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.addFirst(6);
	list.addLast(8);
	list.set(1, 5);
	System.out.println(list);
	list.push(3);
	System.out.println(list);
	
	//STREAMS
	list.stream().filter(n->n%2==0).distinct().forEach(System.out::println);
	
	
	
	//ITERATOR
	Iterator<Integer>it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
