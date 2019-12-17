package ch10_static_final_polymorphism;

class Test {
	private int num=10;
	public final void print() {
		System.out.println(num);
	}
}

public class FinalMethod extends Test{
	int num = 20;
//	public void print() {
//		System.out.println(num);
//	}

//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		super.print();
//	}
	
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		f.print();
	}
}





