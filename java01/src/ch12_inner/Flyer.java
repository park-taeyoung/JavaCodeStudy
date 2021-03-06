package ch12_inner;
// 인터페이스 : 추상 method + 상수
public interface Flyer {
	// public static final int MAX = 100;
	// final 한번 세팅되면 변하지 않는다.
	// static 한번 메모리에 올라가면 끝날때까지 끝나지 않는다.
	// final, static은 같이 따라 다닌다.
	// 인터페이스에서 상수는 가능하지만, 일반적인 변수는
	// 예) public int MAX: <- 에러난다.
	public void takeOff();
	public void fly();
	public void land();

	// 인터페이스에서 static, default 사용가능하지만 현업에서 잘 사용하지 않는다.
	// jdk1.8부터 추가된 메서드다. 인터페이스에서 static 메서드 사용가능하다.
	//	public static void methodA() {
	//		
	//	}
	// jdk1.8부터 추가된 메서드다. 인터페이스에서 default 메서드 사용가능하다.
	//	public default void methodB() {
	//		
	//	}
}


