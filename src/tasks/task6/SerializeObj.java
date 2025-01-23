package tasks.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SerializeObj {
public static void main(String[] args) throws FileNotFoundException, IOException {
	List<Employee> employees=new ArrayList<Employee>();
	Stream<Employee>stream=Stream.of(new Employee(100, "krishna", "yapral"),new Employee(101, "Mathew", "Mehdipatnam"),
			new Employee(102, "sudheer", "LingamPally"),new Employee(103, "Abhinav", "KBHP"));
	employees.addAll(stream.toList());
	EmployeeDb emp=new EmployeeDb(employees);
	try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("employee.ser"))){
		obj.writeObject(emp);
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	System.out.println("sucessfull");
}
}
