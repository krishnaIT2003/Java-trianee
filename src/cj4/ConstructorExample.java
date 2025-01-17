package cj4;

public class ConstructorExample {
	String name;
//default constructor (explicitly invoked)
	public ConstructorExample() {
System.out.println("this is default constructor");
	}
	//parameterized constructor
	ConstructorExample(String name){
		this.name=name;
		System.out.println(this.name);
	}
	
	//copy constructor
	ConstructorExample(ConstructorExample obj){
		this.name=obj.name;
		System.out.println("copied constructor "+this.name);
	}
	
	public static void main(String[] args) {
	ConstructorExample obj=new ConstructorExample();
	ConstructorExample obj1=new ConstructorExample("krishna");
	ConstructorExample ob2=new ConstructorExample(obj);
	

	
}
}
