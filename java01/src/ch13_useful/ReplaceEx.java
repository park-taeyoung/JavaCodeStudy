package ch13_useful;

public class ReplaceEx {
	public static void main(String[] args) {
		String a = "java program";
		System.out.println(a);
		System.out.println(a.replace("java", "�ڹ�"));
		System.out.println(a);
		a=a.replace("java", "�ڹ�");
		System.out.println(a);
	}
}
