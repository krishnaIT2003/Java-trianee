package cj2;

public class BitwiseOperator {
public static void main(String[] args) {
	int a=3;//011
	int b=4;//100
	//  OR operator
	System.out.println(a|b);  //0111
	
	//XOR operator
	System.out.println(a^b);   //0111
	
	//  AND operator
	System.out.println(a&b); //00000
	
	
	//complementary
	System.out.println(~a); /*011
	                            1
	                           100   = 4
	                               ans -4*/
	                        
}
}
