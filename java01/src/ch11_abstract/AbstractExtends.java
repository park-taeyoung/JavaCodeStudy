package ch11_abstract;

public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		System.out.println("�߻�޼ҵ带 �������̵��� �޼ҵ�");
	}
	
	public static void main(String[] args) {
		AbstractExtends e2 = new AbstractExtends();
		e2.method1();
		e2.method2();
	}
}



