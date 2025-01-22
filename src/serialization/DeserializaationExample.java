package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializaationExample {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	Person p=null;
	try(ObjectInputStream is=new ObjectInputStream(new FileInputStream("output.ser"))){
		p=(Person)is.readObject();
		
	}
	catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	System.out.println(p.name);
	System.out.println(p.age);
}
}
