package cj5;

class Q{
	public void add() {
		
	}
}
abstract class Animal extends Q{
	public abstract void voice();
	public  void action() {
		System.out.println("perform actions");
	}
}
public  class AbstractExample {
class Dog extends Animal{

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("dog voice");
	}
	
}
class Cat extends Animal{

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("cat voice");
	}
	
}
	public static void main(String[] args) {
	Animal d=new AbstractExample(). new Dog();
	d.voice();
}
}
