package ch12_inner;
// 인터페이스 : 추상 method + 상수
public interface Flyer {
	// final 한번 세팅되면 변하지 않는다.
	// static 한번 메모리에 올라가면 끝날때까지 끝나지 않는다.
	// 인터페이스에서 상수는 가능하지만, 일반적인 변수는
	// 사용 불가능 하다. 예) public int MAX: <- 에러난다.
	// public static final int MAX = 100;
	public void takeOff();
	public void fly();
	public void land();
//	public static void methodA() {
//		
//	}
//	public default void methodB() {
//		
//	}
}
