package ch11_abstract;

public class Airplane implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Airplane �̷�");
	}
	@Override
	public void fly() {
		System.out.println("Airplane ����");
	}
	@Override
	public void land() {
		System.out.println("Airplane ����");
	}
}


