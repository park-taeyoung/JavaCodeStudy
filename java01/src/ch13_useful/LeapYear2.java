package ch13_useful;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = scan.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
		// 캘린더객체.isLeapYear(연도) => 윤년이면 true, 평년이면 false
		if(cal.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}
