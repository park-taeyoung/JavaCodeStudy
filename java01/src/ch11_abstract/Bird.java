package ch11_abstract;

public class Bird implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Bird �̷�");
	}
	@Override
	public void fly() {
		System.out.println("Bird ����");
	}
	@Override
	public void land() {
		System.out.println("Bird ����");
	}
}


