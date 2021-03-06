package ch10_static_final_polymorphism;

class AA {
	int a= 10;
	public void print() {
		System.out.println(a);
	}
}

class BB extends AA {
	int a= 20;
	@Override
	public void print() {
		System.out.println(a); //오버라이딩(재정의) 메소드
	}
}

public class Poly {
	public static void main(String[] args) {
		// 선풍기리모콘, 선풍기
		BB b = new BB();
		b.print();
		
		// 만능리모콘, 선풍기
		// 만능리모콘, 에어컨
		AA aa = new BB(); // 자식 클래스의 객체를 부모클래스의 참조변수가 가리킴
		System.out.println(aa.a); // 부모클래스의 변수가 호출됨
		
		aa.print(); // 자식 클래스의 메소드 호출(오버라이딩 된 메소드가 호출됨)
	}
}
