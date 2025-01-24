package exception.tasks;

import java.io.IOException;

public class InvalidAgeException extends RuntimeException{
public InvalidAgeException() {
	super("age should be greater than 18 ");
}
}
