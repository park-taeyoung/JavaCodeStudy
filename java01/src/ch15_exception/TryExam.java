package ch15_exception;

public class TryExam {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		try {
			// 배열의 범위 초가
			for(int i=0; i<=5; i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			System.out.println("배열의 인덱스 범위가 초과되었습니다.");
		}
	}
}
