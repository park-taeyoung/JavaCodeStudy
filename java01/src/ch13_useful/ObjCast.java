package ch13_useful;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		Object obj = new Object();
		obj = 20;
		// a = obj; // error
		a = (Integer)obj; // Object �ڷ����� ����ȯ ��Ű�� ����
		System.out.println(a);
		
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
		for(Object o : obj2) {
			System.out.println(o);
		}
	}
}


