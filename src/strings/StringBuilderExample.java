package strings;

public class StringBuilderExample {
public static void main(String[] args) {
	StringBuilder builder=new StringBuilder("krishna");
	System.out.println(builder);
	builder.append(" reddy");
	System.out.println(builder);
	System.out.println("capacity "+builder.capacity());
	System.out.println(builder.insert(3, "hna"));
	
}
}
