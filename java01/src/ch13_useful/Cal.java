package ch13_useful;

import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //캘린더 객체 생성
		//Caldender cal = new Calender(); // new를 쓰면 error 발생
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0~11월
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM)); // 0오전, 1오후
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
	}
}
