package ch04_control;

import java.util.Scanner;

public class Holiday {
	public static void main(String[] args) {
		int year;
		int days;
		// Scanner 클래스의 객체(인스턴스) 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요");
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

		System.out.println("당신의 근속연수는 " + year + "년이고 ");
		System.out.println("휴가연수는 " + days + "일 입니다.");

	}
}
