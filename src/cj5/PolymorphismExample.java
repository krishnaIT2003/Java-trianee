package cj5;

public class PolymorphismExample {
class Animal{
	String gender;
	public void voice() {
		System.out.println("Animal voice");
	}
	public void voice(String gender) {
		System.out.println("animal voice "+gender);
	}
	
}
class Dog extends Animal{
	@Override
	public void voice() {
		System.out.println("dog voice");
	}
	@Override
	public void voice(String gender) {
		System.out.println("dog voice"+gender);
	}
}
class Cat extends Animal{
	@Override
	public void voice() {
		System.out.println("cat voice");
	}
	@Override
	public void voice(String gender) {
		System.out.println("cat voice "+gender);
	}
}
	public static void main(String[] args) {
	Animal a=new PolymorphismExample().new Dog();  //dynamic binding
	Dog d=new PolymorphismExample().new Dog(); //static binding
	Animal b=new PolymorphismExample().new Cat();
	a.voice();
	b.voice("male");
}
}
