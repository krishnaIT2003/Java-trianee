package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo2 {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	System.out.println(list.stream().reduce((x,y)->x+y));// summing values
	
	
}
}
