package ch11_abstract;

public class Point {
	int a, b;
	public Point() { //기본생성자
		this(0,0); // 'this('는 매개변수가 있는 생성자 호출 한다고 했다.
	}              // 첫번째 두번째가 모두 정수인 생성자는 아래 생성자다.
	               // 아무것도 안들어오면 매개변수가 있는 생성자를 호출하라는 뜻이다.
	public Point(int a, int b) {
		this.a=a;
		this.b=b;
	}
}


