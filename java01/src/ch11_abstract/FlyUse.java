package ch11_abstract;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Flyer bird2 = new Bird();
		bird2.takeOff();
		bird2.fly();
		bird2.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		Flyer flyer = new Airplane();
		flyer.takeOff();
		flyer.fly();
		flyer.land();
	}
}


