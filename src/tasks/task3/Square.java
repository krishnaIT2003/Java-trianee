package tasks.task3;

public class Square extends Shape{
	@Override
	public void area(int a) {
		System.out.println("area of square is "+((double)a*a));
	}
	@Override
	public void perimeter(int a) {
		System.out.println("perimeter of square is "+((double)4*a));
	}
}
