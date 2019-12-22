package ch13_useful;

public class StringEx4 {
	// 스트링을 숫자로 Integer.parseInt(문자열)

	// 숫자를 스트링으로 변환
	public static void main(String[] args) {
	String a = 100+"";
	System.out.println(a);
	a = String.valueOf(100);
	System.out.println(a);
	}
}
