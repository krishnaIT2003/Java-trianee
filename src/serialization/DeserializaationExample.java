package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import tasks.task6.EmployeeDb;

public class DeserializaationExample {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	EmployeeDb emp=null;
	try(ObjectInputStream is=new ObjectInputStream(new FileInputStream("employee.ser"))){
		emp=(EmployeeDb)is.readObject();
		
	}
	catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	System.out.println(emp.getEmp());
	
}
}
