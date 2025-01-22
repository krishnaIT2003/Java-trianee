package strings;

public class StringProblems {
	private static String reverseString(String word) {
		String reversed="";
		for(int i=word.length()-1;i>=0;i--) {
			reversed+=word.charAt(i);
		}
		return reversed;
	}
	private static int CountVowels(String word) {
		int count=0;
		for(int i=0;i<word.length();i++) {
			if("aeiou".indexOf(word.charAt(i))!=-1) {
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	System.out.println(CountVowels("krishna"));
	System.out.println(reverseString("krishna"));
}
}
