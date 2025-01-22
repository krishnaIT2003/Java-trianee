package tasks.task3;

public class Triangle extends Shape{
	@Override
	public void area(int a) {
		System.out.println("area of the traingle is "+((double)(Math.sqrt(3)/4)*(a*a)));
	}
	@Override
	public void perimeter(int a) {
		System.out.println("perimeter of the traingle is "+((double)3*a));
	}
}
