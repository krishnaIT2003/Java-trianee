package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputByteStreamExample {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(FileOutputStream fos=new FileOutputStream("output.txt")){
		String text="Hello, this is a byte stream example";
		System.out.println(text.getBytes());
		byte[] data=text.getBytes();
		fos.write(data);
		
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
}
}
