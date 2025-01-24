package exception.tasks;

public class CustomExceptionExample {
public static void main(String[] args) {
int age=12;
try {
	if(age<=18)throw new InvalidAgeException();
	else System.out.println("valid ");
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}
