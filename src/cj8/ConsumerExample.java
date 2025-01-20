package cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class Dem{
	String name;
	
	Dem(String name){
		this.name=name;
		System.out.println("hi");
	}
}
public class ConsumerExample {
public static void main(String[] args) {
	Consumer<String>c1=Dem::new;
	 c1.accept("krishna");
	
	 
	 
	 ///print list
	 
	 List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4));
	 Consumer<List>c2=n->System.out.println(n);
	 c2.accept(list);
}
}
