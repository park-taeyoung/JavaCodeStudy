package ch13_useful;

public class WrapChar {
	public static void main(String[] args) {
		char[] data = {'J', 'a', 'v', 'a', '1', '#'}; // ���ڹ迭
		for (int i=0; i < data.length; i++) {
			data[i] = Character.toUpperCase(data[i]);
			data[i] = Character.toLowerCase(data[i]);
			if (Character.isUpperCase(data[i])) {
				System.out.println(data[i] + "--> �빮��");
			} else if (Character.isLowerCase(data[i])) {
				System.out.println(data[i] + "--> �ҹ���");
			} else if (Character.isDigit(data[i])) {
				System.out.println(data[i] + "--> ����");
			} else {
				System.out.println(data[i] + "--> ��Ÿ����");
			}
		}
	}
}