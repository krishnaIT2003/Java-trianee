package annotations;


@interface MyAnnotation{
	String author() default "unknown";
	String version() default "1.0";
	
}
@MyAnnotation(author = "krishna",version = "2.0")
public class MyClass {
public static void main(String[] args) {
	System.out.println("method in my class");
}
}
