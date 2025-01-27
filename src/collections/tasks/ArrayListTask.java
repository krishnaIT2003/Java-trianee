package collections.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTask {
public static void main(String[] args) {
	List<Integer>arrayList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,9,4,5,6,7,8,9,10));
	
	//Using streams we can iterate
	arrayList.stream().iterator().forEachRemaining(System.out::println);
	
	System.out.println();
	//using iterator
	Iterator<Integer> iterator = arrayList.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ");
	}
	
	System.out.println();
arrayList.add(5, 500); /// changed at specific index

System.out.println(arrayList);

arrayList.sort((o1,o2)->o2.compareTo(o1));
System.out.print("sorted in descending order" +arrayList);

System.out.println();
arrayList.listIterator().add(25);
System.out.println(arrayList);


List<String>arrayList2=new ArrayList<String>(Arrays.asList("krishna","sakshi","Tharun","prithvi","manasa","bharath"));

System.out.println();
arrayList2.stream()
.sorted((o1,o2)->o1.compareToIgnoreCase(o2)).forEach(System.out::println);

arrayList.stream().sorted().forEach(x->System.out.print(x+" "));

arrayList.set(5, 1000);

System.out.println(arrayList);


Integer integer = arrayList.stream().findAny().get();
System.out.println(integer);
arrayList.remove(2);
System.out.println(arrayList);


arrayList.stream().distinct().forEach(x->System.out.print(x+" "));// using strams removing duplicates
List<Integer>unique=new ArrayList<>();
for(Integer i : arrayList) {
	if(!unique.contains(i)) {
		unique.add(i);
	}
}
}
}
