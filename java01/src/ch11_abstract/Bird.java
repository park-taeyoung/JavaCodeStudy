package ch11_abstract;

public class Bird implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Bird ÀÌ·ú");
	}
	@Override
	public void fly() {
		System.out.println("Bird ºñÇà");
	}
	@Override
	public void land() {
		System.out.println("Bird Âø·ú");
	}
}


