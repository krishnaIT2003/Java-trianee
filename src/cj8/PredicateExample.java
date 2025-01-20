package cj8;

import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {
	Predicate<Integer>p1=(n)->n%2==0;
	System.out.println(p1.test(12));
}
}
