package ch13_useful;

import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //Ķ���� ��ü ����
		//Caldender cal = new Calender(); // new�� ���� error �߻�
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0~11��
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM)); // 0����, 1����
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}
