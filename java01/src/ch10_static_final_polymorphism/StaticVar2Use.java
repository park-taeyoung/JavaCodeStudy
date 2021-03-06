package ch10_static_final_polymorphism;

public class StaticVar2Use {
	public static void main(String[] args) {
		// static은 클래스 이름으로 접근 가능, 객체 없어도됨
		// nonstatic은 객체 생성 후 사용가능
		System.out.println(StaticVar2.total);
		StaticVar2 car1 = new StaticVar2("소나타");
		StaticVar2 car2 = new StaticVar2("모닝");
		StaticVar2 car3 = new StaticVar2("아반테");
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
	}
}
