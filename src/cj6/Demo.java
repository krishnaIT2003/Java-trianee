package cj6;

public class Demo {
public static void main(String[] args) throws CustomeException {
	int age=11;
	if(age<18) {
		try {
			throw new CustomeException("age not found");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	else {
		System.out.println("valid");
	}
}
}
