package ch13_useful;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// ���� ���
		// 4�� ����̰� 100�� ����� �ƴ� ��, �Ǵ� 400�� ����� ��
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int year = scan.nextInt();
		if(year%4==0&&year%100!=0 || year %400==0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}