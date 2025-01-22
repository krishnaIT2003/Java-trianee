package generics;

public class UpperBoundExample<T extends Number> {
	private T number;
	 public void setNumber(T number) {
	        this.number = number;
	    }

	    public T getNumber() {
	        return number;
	    }
	
	
public static void main(String[] args) {
	 UpperBoundExample<Integer> intBox = new UpperBoundExample();
     intBox.setNumber(10);
     System.out.println("Integer value: " + intBox.getNumber());

     // This will throw an error because String is not a subclass of Number
     // UpperBoundExample<String> strBox = new UpperBoundExample<>();	
}
}
