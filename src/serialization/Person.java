package serialization;

import java.io.Serializable;

public class Person implements Serializable{

	String name;
	int age;
	
	  Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
}
