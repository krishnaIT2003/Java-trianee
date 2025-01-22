package tasks.task3;

public class Circle extends Shape {
	@Override
	public void area(int a) {
		
		System.out.println("area of circle is  "+((double)(22/7)*(a*a)));
	}
	@Override
	public void perimeter(int a) {
		System.out.println("perimeter of circle is "+((double)2*(22/7)*a));
	}
}
