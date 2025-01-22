package enumurations;

public class Main {
public static void main(String[] args) {
	Day day=Day.WEDNESADY;

	System.out.println(day);
	
	HttpStatus httpStatus=HttpStatus.SUCCESS;
	System.out.println(httpStatus);
	System.out.println(httpStatus.getStatusCode());
}

}
