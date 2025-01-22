package generics;

import java.util.Arrays;
import java.util.List;

public class WirldCardExample {
	 public static void printList(List<?> list) {
	        for (Object obj : list) {
	            System.out.println(obj);
	        }
	    }

public static void main(String[] args) {
	 List<Integer> intList = Arrays.asList(1, 2, 3);
     List<String> strList = Arrays.asList("Apple", "Banana", "Cherry");

     printList(intList);  
     printList(strList);  
}
}
