package cj8;

import java.util.function.Function;

public class FunctionExample {
public static void main(String[] args) {
	Function<String,Integer>func=(a)->a.length();
	System.out.println(func.apply("krishna"));
	Function<String,String>f2=(a)->a.toUpperCase();
	System.out.println(f2.apply("Krishna"));
}
}
