package ch13_useful;

public class Wrapper {
	public static void main(String[] args) {
		//���� Ŭ����
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		int num1 = i1.intValue(); //���������� �ڵ���ȯ
		int num2 = i2;
		int sum = num1 + num2;
		System.out.println(sum);
		
		System.out.println(Integer.toBinaryString(sum)); // 2������ ���
		System.out.println(Integer.toOctalString(sum)); // 8����
		System.out.println(Integer.toHexString(sum)); // 16����
		System.out.println(Integer.MAX_VALUE); // int �ִ밪
		System.out.println(Integer.MIN_VALUE); // int �ּҰ�
		System.out.println(Integer.parseInt("100")); // ���ڿ��� ������ ��ȯ
		System.out.println(Integer.toString(100)); // ������ ���ڿ��� ��ȯ
		System.out.println(100+""); // ������ ���ڿ��� ��ȯ
	}
}