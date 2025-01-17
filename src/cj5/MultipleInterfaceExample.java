package cj5;
interface i1{
int a=12;// implicitly static final constant	
	
}
interface i2{
	
}
interface i3{
	
}
class c1{
	
}
public class MultipleInterfaceExample extends c1 implements i1,i2,i3 {
public static void main(String[] args) {
System.out.println(i1.a);
	
}
}
