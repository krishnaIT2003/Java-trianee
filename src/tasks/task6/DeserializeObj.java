package tasks.task6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeObj {
	public static EmployeeDb getEmployeeDb() {
		EmployeeDb data=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.ser"))){
			data=(EmployeeDb)ois.readObject();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return data;
	}
	
	

}
