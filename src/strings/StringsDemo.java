package strings;

public class StringsDemo {
	public static void main(String[] args) {
		String str1="krishnar";
		String str2="krishna";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("is == "+(str1==str2));
		System.out.println("is literal equal "+str1.equals(str2));

		String str3=new String("tech");
		String str4=new String("tech");
		System.out.println("is == "+(str3==str4));
		System.out.println("is (new) literals equal  "+str3.equals(str4));

		String str5=str1.concat(" reddy");
		System.out.println("concatenated string is "+str5);
		System.out.println("immutable string is "+str1);  /// immutable 

		System.out.println("uppercase: "+str1.toUpperCase());
		System.out.println("lowercase "+str1.toLowerCase());
		System.out.println(" lastindex of  "+str1.lastIndexOf("i"));
		System.out.println("firstindex of "+str1.replaceFirst("k", "T"));//  str1 will not be replaced 
		System.out.println(str1);
		System.out.println("find a character based on index "+str1.charAt(5));
		System.out.println("Ascii value "+str1.codePointAt(1));
		System.out.println("retreives ascii of ith -1 index "+str1.codePointBefore(1));
		System.out.println(str1.codePointCount(0, 5));
		String str6="Hello 👋 World";
		System.out.println(str1.compareTo(str6));// the result is the difference between the Unicode values of the first differing characters.
		System.out.println(str1.contains("s"));
		System.out.println(str1.contentEquals("krishnar"));
		System.out.println(str1.endsWith("nar"));
		str3.concat("out");
		System.out.println(str3);
		System.out.println(str1.hashCode());
		System.out.println(str1.equalsIgnoreCase("KRISHNAR"));
		System.out.println("indent  "+str1.indent(1));// adds or removes leading spaces (indentation) from a string. This method was introduced in Java 12.
		String str7="hello\nworld";
		System.out.println("indent "+str7.indent(1));
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.startsWith("krish"));
		System.out.println("jhorse Bolo".intern());//The intern() method checks if a string with the same content is already present in the string pool.
		System.out.println(str6.strip());
		System.out.println(str7.strip());//The strip() method in Java removes all leading and trailing whitespace from a string. It was introduced in Java 11 and is an enhancement over the older trim() method.
		System.out.println("    hello, world    ".strip());
		System.out.println("  hello,world".trim());//Removes only ASCII spaces (\u0020).
		String parts[]="he,ll,wor,ld".split(",");

             for(String i:parts) {
            	 System.out.print(i+" ");
             }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
