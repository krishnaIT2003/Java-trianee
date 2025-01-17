package cj3;

public class ForLoopsExample {
	
	
	public static void printisPrime(int n) {
		int count=0;
		for(int i=2;i<n/2;i++) {
			if(i%n==0) {
				count=1;
				System.out.println("it is prime");
				return;
			}
		}
		if(count==0)
			System.out.println("it is not a prime");
	}
	
	public static void printPrimeBetweenNumbers(int start,int end) {
		if(start<=1)start=2;
		int count=0;
		for(int i=start;i<=end;i++) {
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					count=1;
					break;
				}
				
			}
			if(count==0)System.out.println(i);
			count=0;
		}
	}
public static void main(String[] args) {
for(int i=0;i<10;i++) {
	System.out.println(i);
}

for(int i=0;i<10;i++) {
	if(i==5)continue;
	if(i==8)break;
	System.out.println(i);
}
printisPrime(7);
printPrimeBetweenNumbers(0, 50);
}
}
