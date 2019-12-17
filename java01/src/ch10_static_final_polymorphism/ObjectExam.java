package ch10_static_final_polymorphism;

public class ObjectExam extends Object{
	public static void main(String[] args) {
		ObjectExam ex = new ObjectExam();
		System.out.println(ex.getClass());
		
		Object a = 100;
		System.out.println(a);
		a=100.5;
		System.out.println(a);
		a=true;
		System.out.println(a);
		a="Hello";
		System.out.println(a);
	}
}
