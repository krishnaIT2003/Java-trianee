package cj7;

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
	list.push(3);
	System.out.println(list);
}
}
