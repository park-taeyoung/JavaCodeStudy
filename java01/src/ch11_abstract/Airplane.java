package ch11_abstract;

public class Airplane implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Airplane ÀÌ·ú");
	}
	@Override
	public void fly() {
		System.out.println("Airplane ºñÇà");
	}
	@Override
	public void land() {
		System.out.println("Airplane Âø·ú");
	}
}


