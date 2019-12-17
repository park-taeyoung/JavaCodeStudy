package ch09_inherit;
	// 멤버변수, 전역변수, 필드(field)
	public class Area {
	private int width;
	private int length;
	public Area() {} // 기본생성자
	public Area(int width, int length) {
		this.width=width;
		this.length=length;
	}
	public int getArea() {
		return width*length;
	}
}
