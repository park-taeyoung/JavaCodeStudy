package ch09_inherit;
import ch09_inherit.Volume;

public class VolumeUse {
	public static void main(String[] args) {
		Volume vol = new Volume(10, 20, 30);
		System.out.println("���� : " + vol.getVolume());
	}
}
