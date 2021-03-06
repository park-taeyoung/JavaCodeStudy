package ch13_useful;

public class Wrapper {
	public static void main(String[] args) {
		//렙퍼 클래스
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		int num1 = i1.intValue(); //내부적으로 자동변환
		int num2 = i2;
		int sum = num1 + num2;
		System.out.println(sum);
		
		System.out.println(Integer.toBinaryString(sum)); // 2진수로 출력
		System.out.println(Integer.toOctalString(sum)); // 8진수
		System.out.println(Integer.toHexString(sum)); // 16진수
		System.out.println(Integer.MAX_VALUE); // int 최대값
		System.out.println(Integer.MIN_VALUE); // int 최소값
		System.out.println(Integer.parseInt("100")); // 문자열을 정수로 변환
		System.out.println(Integer.toString(100)); // 정수를 문자열로 변환
		System.out.println(100+""); // 정수를 문자열로 변환
	}
}
