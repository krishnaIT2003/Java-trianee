package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	list.stream().filter(x->x%2==0).forEach(System.out::println);
	long count = list.stream().filter(x->x%2==0).count();
	System.out.println(count);
	Stream.generate(()->1);
	Stream.iterate(1, x->x+1);
}
}
