package ch06_method;
public class CallBy2 {
	static void print1(String n1, String n2, String n3, String n4) {
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
	
	static void print2(String [] s) {
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	public static void main(String[] args) {
		String [] str = {"김철수","송영호","한상수","허준영","박철호"};
//		for(String s : str) {
//			System.out.println(s);
//		}
//		print1(str[0], str[1], str[2], str[3]);
		
		
		// 주소값에 의한 호출 (call by address, call by reference)
		print2(str);
		
	}
}
