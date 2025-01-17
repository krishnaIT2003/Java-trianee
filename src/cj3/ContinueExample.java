package cj3;

public class ContinueExample {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	for(int i=0;i<10;i++) {
		if(i%2==0)continue;
		System.out.println("for "+i);
	}
	int i=0;
	while(i<=10)
	{
		if(i%2==1) {
			i++;
			continue;
		}
		
		System.out.println("while "+i);
		i++;
	}
for1:for(int j=0;j<10;j++) {
	for2:for(int k=0;k<10;k++) {
		if(j==5) break for1;
		System.err.println(k);
	}
}

}
}
