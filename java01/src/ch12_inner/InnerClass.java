package ch12_inner;
// static : 정적멤버, 프로그램 시작~끝까지 변하지 않음
// dynamic : 동적멤버
public class InnerClass { // 외부 클래스 (outer class)
	static int x= 10;
	class Inner { // 내부 클래스 (inner class)
		int getX() {
			return x;
		}
	}
	public static void main(String[] args) {
		System.out.println(x);
		// 외부클래스의 인스턴스 생성
		InnerClass e = new InnerClass();
		// 내부클래스의 인스턴스 생성
		InnerClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}
}
