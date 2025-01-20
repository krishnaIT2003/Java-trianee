package cj7;

import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
	TreeSet<Integer>set=new TreeSet<Integer>();
	set.add(1);
	set.add(4);
	set.add(7);
	set.add(3);
	set.add(7);
	set.add(6);
	
	
	System.out.println(set);
	
	System.out.println("does 7 contains"+set.contains(7));
	
	set.remove(7);
	System.out.println("after removing "+set);
	System.out.println("first "+set.first());
	System.out.println();
}
}
