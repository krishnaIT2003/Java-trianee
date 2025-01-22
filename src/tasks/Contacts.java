package tasks;

public class Contacts {
	String name;
	int numbers[]=new int[5];
	Contacts(String name,int numbers){
		this.name=name;
		this.numbers[0]=numbers;
	}
	Contacts(String name,int ...numbers){
		this.name=name;
		this.numbers=numbers;
	}

}
