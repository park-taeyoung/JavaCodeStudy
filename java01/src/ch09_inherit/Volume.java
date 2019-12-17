package ch09_inherit;

public class Volume extends Area {
	private int height;
	public Volume(int width, int length, int height) {
		super(width, length);
		this.height = height;
	}
	
	public int getVolume() {
		return getArea()*height;
	}

}
