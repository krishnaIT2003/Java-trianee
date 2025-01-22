package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamExample {
public static void main(String[] args) {
	
	try {
		File file=new File("example.txt");
		if(!file.exists())file.createNewFile();
		FileInputStream fis=new FileInputStream("example.txt");
		int data;
		
		
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
	}
	catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	}
}
}
