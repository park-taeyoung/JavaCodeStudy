package ch04_control;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = scan.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + ": ¦�� �Դϴ�.");
		} else {
			System.out.println(a + ": Ȧ�� �Դϴ�.");
		}
	}
}
