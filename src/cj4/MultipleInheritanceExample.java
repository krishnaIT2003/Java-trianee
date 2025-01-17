package cj4;

public class MultipleInheritanceExample {
	interface A{
		public void add();
	}
	class Parent{
	public void add() {
		System.out.println("hiii ");
	}	
	}
	class Child extends Parent implements A{

		@Override
		public void add() {
			System.out.println("interface implementation");
			
		}
		
	}
public static void main(String[] args) {
Child c=new MultipleInheritanceExample().new Child();
c.add();
}
}
