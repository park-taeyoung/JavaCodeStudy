package ch13_useful;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("java"); // 스트링 연결
		System.out.println(str1.toString());
		str1.append(" Programming");
		System.out.println(str1);
		
		str1.replace(0,  4,  "JSP"); // 인덱스 0~3까지의 내용을 JSP로 교체
		System.out.println(str1);
		String str2 = str1.substring(3); // 인덱스 3부터 끝까지 복사
		System.out.println(str1);
		System.out.println(str2);
	}
}
