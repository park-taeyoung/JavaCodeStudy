package ch13_useful;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int year = scan.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
		// Ķ������ü.isLeapYear(����) => �����̸� true, ����̸� false
		if(cal.isLeapYear(year)) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}
