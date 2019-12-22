package ch13_useful;

import java.util.Arrays;

public class ArrEqual {
	public static void main(String[] args) {
		int[] num1 = {10, 20, 30, 40, 50};
		int[] num2 = {10, 20, 30, 40, 50};
		// Arrays.euqals(배열1, 배열2) -> 두 배열의 내용을 비교
		if(Arrays.equals(num1, num2)) {
			System.out.println("배열의 내용이 같습니다.");
		} else {
			System.out.println("배열의 내용이 다릅니다.");
		}
	}
}
