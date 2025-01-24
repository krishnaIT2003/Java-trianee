package collections.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArraysConversion {
public static void main(String[] args) {
	String fruits[]= {"orange","banana","apple"};
	List<String>arrayList1=Arrays.asList(fruits);
System.out.println("arrayList1 "+arrayList1);
List<String>arrayList2=List.of(fruits);//immutable

System.out.println("arrayList 2 "+arrayList2);
	

List<String>arrayList3=new ArrayList<String>();
Collections.addAll(arrayList3, fruits);

System.out.println("arrayLidt 3 " + arrayList3);

List<String>list=new ArrayList<String>(Arrays.asList("apple","banana","kiwi"));

String[] arr1=list.stream().toArray(String[]::new);
for(String i:arr1) {
	System.out.println(i);
}
String[] arr2=list.toArray(String[]::new);

for(String i:arr2) {
	System.out.println(i);
}

String[] arr3 = new String[list.size()];
for(int i=0;i<list.size();i++) {
	arr3[i]=list.get(i);
}











}
}
