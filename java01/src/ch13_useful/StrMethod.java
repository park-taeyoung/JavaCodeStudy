package ch13_useful;
public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming";
		System.out.println(str1.length()); // 문자열길이
		String str2 = str1.concat("programming"); // 두개의 문자열을 합침
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2)); // 세번째 글자
		System.out.println(str2.indexOf("r")); // r의 인덱스
		System.out.println(str2.indexOf("z")); // z의 인덱스
		System.out.println(str2.substring(0,4));
		System.out.println(str2.substring(5));
		System.out.println(str2.replace("java", "jsp"));
		System.out.println(str2);
		str2 = str2.replace("java", "jsp");
		System.out.println(str2);
	}
}