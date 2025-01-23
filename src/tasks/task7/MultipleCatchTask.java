package tasks.task7;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class MultipleCatchTask {
public static void main(String[] args) {
	try {
		int arr[]= {1,2,3,4};
		System.out.println(arr[8]);
		System.out.println(2/0);
		File f= new File("vvv.txt");
		if (!f.exists()) {
            throw new IOException("File not found.");
        }
		
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
		
	}catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e.getMessage());
	}
	
}
}
