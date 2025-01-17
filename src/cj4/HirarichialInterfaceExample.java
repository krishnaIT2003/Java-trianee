package cj4;

public class HirarichialInterfaceExample {
	class Parent{
		String parentName;

		public String getParentName() {
			return parentName;
		}

		public void setParentName(String parentName) {
			this.parentName = parentName;
		}
	}
	class Child1 extends Parent{
		String childName;

		public String getChildName() {
			return childName;
		}

		public void setChildName(String childName) {
			this.childName = childName;
		}
	}
	class Child2 extends Parent{
		String childName;

		public String getChildName() {
			return childName;
		}

		public void setChildName(String childName) {
			this.childName = childName;
		}
	}
	public void display() {
		System.out.println("this is hierarichial inheritance");
	}
public static void main(String[] args) {
	
	Child1 c1=new HirarichialInterfaceExample().new Child1();
	Child2 c2=new HirarichialInterfaceExample().new Child2();
			c1.setParentName("krishna");
			c2.setParentName("krish");
			System.out.println(c2.parentName);

}
}
