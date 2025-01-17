package cj4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssociationExample {
	class Employee{
//		private int id;
		private String name;
		
		Employee(String name){
			this.name=name;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + "]";
		}
		
	}
	class Company{
		private String companyName;
		private Set<Employee>employees;
		public String getCompanName() {
			return companyName;
		}
		Company(String companyName){
			this.companyName=companyName;
		}
		public Set<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(Set<Employee> employees) {
			this.employees = employees;
		}
		
		
	}
public static void main(String[] args) {
	Employee employee=new AssociationExample(). new Employee("krishna");
	Employee employee2=new AssociationExample().new Employee("nani");
	Set<Employee>emp=new HashSet<AssociationExample.Employee>();
	emp.add(employee);
	emp.add(employee2);
	Company c=new AssociationExample(). new Company("TECH");
	c.setEmployees(emp);
	System.out.println(c.getEmployees());
}
}
