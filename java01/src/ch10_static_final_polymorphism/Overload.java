package ch10_static_final_polymorphism;

public class Overload {
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.putData("hello");
		obj.putData(100);
		obj.putData(100.5);
	}
}



