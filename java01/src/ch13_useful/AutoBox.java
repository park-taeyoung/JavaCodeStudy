package ch13_useful;

public class AutoBox {
	public static void main(String[] args) {
		int num1 = 10;
		int num2;
		Integer i1;
		// Integer i2 = new Integer(20);
		Integer i2 = 20; // 오토박싱
		i1 = num1; // auto boxing (기본자료형을 객체로 박스처리)
		num2 = i2; // auto unboxing (객체 안에 들어있는 값을 풀어서 저장)
		System.out.println(num1 + "\t"+i1);
		System.out.println(num2 + "\t"+i2);
	}
}


