package ch13_useful;

public class StringEx5 {
	public static void main(String[] args) {
		String jumin = "911231-1234567";
		String jumin2 = "031231-3234567";
		int year = 1900 + Integer.parseInt(jumin.substring(0, 2));
		System.out.println("출생년도: "+year);
		String gender = jumin.substring(7,8);
		System.out.println(gender);
		if(gender.equals("1")) {
			System.out.println("남성");
		} else if(gender.equals("2")) {
			System.out.println("여성");
		}
	}
}
