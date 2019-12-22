package ch13_useful;

public class Str {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		
		str = "";
		System.out.println(str);
		str = null;
		System.out.println(str);
		
		char ch = '\0';
		System.out.println(ch+", code"+(int)ch);
		ch = ' ';
		System.out.println(ch+", code"+(int)ch);
	}
}
