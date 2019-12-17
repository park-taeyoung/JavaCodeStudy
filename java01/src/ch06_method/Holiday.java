package ch06_method;
import java.util.Scanner;
public class Holiday {
	// 근속연수가
	// 1-5 년 10일
	// 6-10년 15일
	// 11년 이상 20일
	
	// 전역 변수
	static int y;
	
	// 입력method
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("근속연수");
		y = scan.nextInt();
		scan.close();
	}
	
	// 계산 method
	static int holiday(int year) {
		int day = 0;
		if(year <= 5) {
			day = 10;
		}else if(year <= 10) {
			day = 15;
		}else {
			day = 20;
		}
		return day;
	}

	public static void main(String[] args) {
		input();
		System.out.println("휴가일수" + holiday(y));
	}


}
