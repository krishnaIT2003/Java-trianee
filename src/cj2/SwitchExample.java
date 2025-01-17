package cj2;

public class SwitchExample {
public static void main(String[] args) {
	int day=3;
	String result=switch(day) {
	case 1-> "monday";
	case 2-> "tuesday";
	case 3-> "wednesday";
	default -> "use";
	
	};
	System.out.println(result);
	System.out.println(20>18);
}
}
