package ch12_inner;

public class InnerFinal {
	private int x = 10;
	void print() {
		//지역변수(local variable), 자동변수
		// 아직까진  final 붙이는게 좋을 것 같다.
		final int y=20; 
		class Inner { //method 내부에 선언된 내부 클래스
			void test() {
// 내부클래스에서는 외부클래스의 모든 멤버변수에 접근가능
				System.out.println(x);
				// jdk1.8 부터 허용했음. 같은 메서드 안에서는 사용 가능.
				System.out.println(y);
			}
		}
	}
}
