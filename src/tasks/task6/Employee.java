package tasks.task6;

import java.io.Serializable;

public class Employee implements Serializable{
	private int employeeId;
private String employeeName;
private String employeeAddress;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public Employee(int employeeId, String employeeName, String employeeAddress) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
			+ employeeAddress + "]";
}

 
}
