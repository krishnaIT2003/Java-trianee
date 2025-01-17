package cj3;

public class WhileLoopsExample {
public static void main(String[] args) {
	int i=0;
	while(true) {
		if(i==50)break;
		System.out.println(i);
		i++;
	
	}
	System.out.println(i);
	i=0;
	while(i<10) {
		System.out.println(i);
		i++;
	}
	do {
		i++;
		System.out.println(i);
		
	}
	while(i<10);
}
}
