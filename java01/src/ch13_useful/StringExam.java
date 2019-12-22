package ch13_useful;

public class StringExam {
	public static void main(String[] args) {
		// String str = new String("hello");
		String str = "hello";
		String str2 = "hello";
		System.out.println(str==str2);
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}
