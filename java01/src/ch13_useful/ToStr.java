package ch13_useful;

public class ToStr {
	public static void main(String[] args) {
		// Object : ��� �ڷ��� ó�� ����
		Object obj = new Object();
		// ojb1 = 20;
		obj = new Integer(20);
		System.out.println(obj);
		// ojb1 = 20.5;
		obj = new Double(20.5);
		System.out.println(obj);
		// ojb1 = "hello";
		obj = new String("hello");
		System.out.println(obj);
	}
}
