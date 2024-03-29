package ch13_useful;

import java.util.Calendar;

public class Cal2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //캘린더 객체 생성
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //몇번째 날
		// 요일 (1 일요일 ~ 7 토요일)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: yoil = "일요일"; break;
		case 2: yoil = "월요일"; break;
		case 3: yoil = "화요일"; break;
		case 4: yoil = "수요일"; break;
		case 5: yoil = "목요일"; break;
		case 6: yoil = "금요일"; break;
		case 7: yoil = "토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//몇번째 주
	}
}
