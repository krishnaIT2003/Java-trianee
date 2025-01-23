package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
public static void main(String[] args) throws IOException {
	File file=new File("file1.txt");
	if(!file.exists()) {
		System.out.println("new File created");
		file.createNewFile();
	}
try(FileOutputStream os=new FileOutputStream(file)){
	String data="hi This is Java Output Stream ";
	os.write(data.getBytes());
}
catch(Exception e) {
	System.out.println(e.getLocalizedMessage());
}

}
}
