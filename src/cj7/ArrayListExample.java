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

	}
}
