package ch04_control;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = scan.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + ": 짝수 입니다.");
		} else {
			System.out.println(a + ": 홀수 입니다.");
		}
	}
}
