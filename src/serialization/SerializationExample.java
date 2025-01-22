package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Person p=new Person("krishna", 21);
	try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("output.ser"))){
		os.writeObject(p);
	}
	catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	}
}
}
