package ch12_inner;

public class StaticInner {
	static int x=10;
	int getX() {
		return x;
	}
	static class Inner {
		int getX() {
			return x;
		}
	}
	public static void main(String[] args) {
		StaticInner out = new StaticInner();
		System.out.println(out.getX());
		StaticInner.Inner in = new StaticInner.Inner();
		System.out.println(in.getX());
	}
}
