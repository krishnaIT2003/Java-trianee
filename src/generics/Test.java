package generics;

public class Test<T> {
private T name;

Test(T name){
	this.name=name;
}

public T getName() {
	return name;
}

public void setName(T name) {
	this.name = name;
}

public static <K> void printArray(K[] array) {
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	
}

public static void main(String[] args) {
	Test t=new Test("krishna");
	System.out.println(t.getName());
	printArray(new Integer[] {1,2,3,4,5});
}





















}
