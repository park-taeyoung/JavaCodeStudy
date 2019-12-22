package ch13_useful;

public class Str2 {
	public static void main(String[] args) {
		String str = " ";
		System.out.println("내용: "+str);
		System.out.println("글자수: "+str.length());
		str = null;
		System.out.println("내용: "+str);
		System.out.println("글자수: "+str.length());
	}
}
