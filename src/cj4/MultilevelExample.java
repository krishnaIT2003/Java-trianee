package cj4;

public class MultilevelExample {
	class A{
		String Aname;

		public String getAname() {
			return Aname;
		}

		public void setAname(String aname) {
			Aname = aname;
		}
		
	}
	class B extends A{
		String Bname;
	}
	class C extends B{
		
	}
public static void main(String[] args) {
	C c=new MultilevelExample().new C();
 c.Aname="krish";
 c.Bname="krishna";
 System.out.println(c.Bname);
	
}
}
