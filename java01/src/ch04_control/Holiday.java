package ch04_control;

import java.util.Scanner;

public class Holiday {
	public static void main(String[] args) {
		int year;
		int days;
		// Scanner Ŭ������ ��ü(�ν��Ͻ�) ����
		Scanner scan = new Scanner(System.in);
		System.out.println("�ټӿ����� �Է��ϼ���");
		year = scan.nextInt();
		scan.close();
		if (1 <= year && year <= 3) {
			days = 3;
		} else if (4 <= year && year <= 10) {
			days = 5;
		} else if (11 <= year && year <= 20) {
			days = 10;
		} else {
			days = 20;
		}

		System.out.println("����� �ټӿ����� " + year + "���̰� ");
		System.out.println("�ް������� " + days + "�� �Դϴ�.");

	}
}
