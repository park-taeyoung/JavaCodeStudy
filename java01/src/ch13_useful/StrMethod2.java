package ch13_useful;

public class StrMethod2 {
	public static void main(String[] args) {
		String str = "java programming";
		if(str.indexOf("java") != -1) {
			System.out.println("찾는 내용이 있습니다.");
		} else {
			System.out.println("찾는 애용이 없습니다.");
		}
	}
}
