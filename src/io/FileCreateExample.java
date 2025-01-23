package io;

import java.io.File;
import java.io.IOException;

public class FileCreateExample {
public static void main(String[] args) throws IOException {
	File file=new File("employee.ser");
	if(!file.exists()) {
		file.createNewFile();
	}
}
}
