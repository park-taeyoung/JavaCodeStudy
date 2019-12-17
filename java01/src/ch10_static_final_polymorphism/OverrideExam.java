package ch10_static_final_polymorphism;

class Test1 {
	public void print() {
		System.out.println("Test1 클래스의 print Method");
	}
}

class Test2 extends Test1 {
	public void print() {
		System.out.println("Test2 클래스의 print Method");
	}
}

public class OverrideExam {
	public static void main(String[] args) {
		Test2  t = new Test2();
		t.print();
	}
}
