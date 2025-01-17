package cj5;

public class ThisExample {
	String name;
public void add(int a) {
	System.out.println(a);
}
public ThisExample() {
	this("krishna");
}
ThisExample(String name){
	this.name=name;
	this.add(5);
	System.out.println("parameterized constructor "+name);
}
	public static void main(String[] args) {
	ThisExample obj=new ThisExample();
	
}
}
