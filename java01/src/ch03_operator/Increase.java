package ch03_operator;

public class Increase {
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++; // i�� ���� 1������Ŵ (���߿� ���)
		System.out.println(i+","+j);
		i=5;
		j=++i; // i�� ���� 1������Ŵ (���� ���)
		System.out.println(i+","+j);
	}
}
