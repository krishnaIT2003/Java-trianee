package cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression2Ex {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>(Arrays.asList("krishna","sudheer","ranjith","abhinav","shiva"));

list.stream().map(s->s.toUpperCase()).filter(s->s.startsWith("S")).forEach(System.out::println);

System.out.println("custom sorting \n\n");

list.stream().sorted((e1,e2)->e1.compareTo(e2)).map(e->e.toUpperCase()).forEach(System.out::println);
}
}
