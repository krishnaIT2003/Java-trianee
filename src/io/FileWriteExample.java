package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
public static void main(String[] args) throws IOException {

	try(FileWriter fw=new FileWriter("hey.txt");) {
		
		fw.write("hi , this is krishna ");
	}
	catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
//		fw.close();
	}
}
}
