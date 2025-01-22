package cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		list.clear();
		System.out.println("after clear "+list);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(3);
		System.out.println(list);
		
		
		boolean contains = list.contains(2);
		System.out.println(contains);
		
		
		//for each
		list.forEach(i->{i=i*i;
		System.out.print(i+" ");});
		System.out.println();
		System.out.println(list);
		Collections.sort(list);



		//Iterator
		Iterator it=list.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("clone "+list.clone());
		System.out.println(list.isEmpty());
		System.out.println("removing value "+list.remove(3));
		System.out.println(list.set(0, null));
		System.out.println(list);
		Object[] arr=list.toArray();
		
		list.spliterator().forEachRemaining(System.out::print);
		
		
	}
}
