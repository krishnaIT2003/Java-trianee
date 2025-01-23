package tasks.task6;

import java.util.Scanner;

public class Main {
public static void main(String[] args) throws NotFoundException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee id ");
	int employeeId=sc.nextInt();
	EmployeeDb employee=new EmployeeDb();

	
	
	try {
		boolean isFound = DeserializeObj.getEmployeeDb().getEmp().stream().anyMatch(emp->emp.getEmployeeId()==employeeId);
		if (!isFound) {
            throw new NotFoundException();
        }
		else {
			System.out.println("Welcome To Office");
		}
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}

	
}
}
