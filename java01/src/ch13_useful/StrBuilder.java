package ch13_useful;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("java"); // ��Ʈ�� ����
		System.out.println(str1.toString());
		str1.append(" Programming");
		System.out.println(str1);
		
		str1.replace(0,  4,  "JSP"); // �ε��� 0~3������ ������ JSP�� ��ü
		System.out.println(str1);
		String str2 = str1.substring(3); // �ε��� 3���� ������ ����
		System.out.println(str1);
		System.out.println(str2);
	}
}