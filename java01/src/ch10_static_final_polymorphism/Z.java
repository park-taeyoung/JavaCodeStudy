package ch10_static_final_polymorphism;

// 제일먼저 static 변수를 메모리에 올린다.
// main 메소드가 올라간 시점에서 String name 변수가 생기지 않았다.
// name 변수를 쓰려면 new로 메모리에 올린 후 사용해야 한다.
// 즉, nonstatic 은 객체를 생성 한 후에 로딩이 된다.


class Z {
	String name = "kim";
	static int n=20;
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {
		int a=10;
		double b=20.5;
		A name = new A();
		System.out.println(name);
		System.out.println(n);
	}
}


