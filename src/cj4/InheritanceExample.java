package cj4;
//single inheritance
class A{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class B extends A{
	int age;
}


public class InheritanceExample {
public static void main(String[] args) {
  B b=new B();
  b.name ="krishna";
  System.out.println(b.name);
}
}
