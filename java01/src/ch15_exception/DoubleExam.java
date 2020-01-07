package ch15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 2개 이상의 예외가 함께 발생하는 경우
public class DoubleExam {
	public static void main(String[] args) {
		int num = 50;
		Scanner sc = null;
		
		try {
			System.out.println("숫자를 입력하세요.");
			sc = new Scanner(System.in);
			int value = sc.nextInt();
			System.out.println(num/value);
		} catch (ArithmeticException ae) { // 산술 연산 관련 예외처리
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException ie) { // 잘못된 입력데이터 예외처리
			System.out.println("숫자만 입력 가능합니다.");
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
		} finally { //예외 발생 여부 관계 없이 항상 실행되는 코드
			System.out.println("프로그램이 종료되었습니다.");
		}
	}
}
