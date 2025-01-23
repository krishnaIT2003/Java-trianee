package tasks.task6;

import java.io.Serializable;
import java.util.List;

public class EmployeeDb implements Serializable{
List<Employee>emp;
EmployeeDb(){
	
}
EmployeeDb(List<Employee>emp){
	this.emp=emp;
}
public List<Employee> getEmp() {
	return emp;
}
public void setEmp(List<Employee> emp) {
	this.emp = emp;
}

}
