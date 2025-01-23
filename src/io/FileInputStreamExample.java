package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
public static void main(String[] args) throws FileNotFoundException, IOException {
	int data=0;
	try(FileInputStream fis=new FileInputStream(new File("file1.txt"))){
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
	}
	catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
}
}
