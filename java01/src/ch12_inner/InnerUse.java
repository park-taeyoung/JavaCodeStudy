package ch12_inner;
// InnerUse.class
// InnerUse$1.classs
// 외부클래스$번호.class로 컴파일됨
public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {
			@Override
			public void takeOff() {
				System.out.println("takeOff...");
			}
			@Override
			public void fly() {
				System.out.println("fly...");
			}
			@Override
			public void land() {
				System.out.println("land...");
			}
		};
		f.takeOff();
		f.fly();
		f.land();
	}
}
//	# 기본 클래스
//	class 클래스이름 {
//	}
//	# 무명 클래스, 익명 클래스
//	new 자료형() {
//	}


