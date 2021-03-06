import java.util.Random;

public class MakeNum {
	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];
		int num;
		boolean flag = false; // 중복된 값의 여부를 확인하는 변수

		for (int i = 0; i < lotto.length; i++) {
			num = Math.abs(r.nextInt(45)) + 1;
			lotto[i] = num;

			// 번호가 생성될때마다 중복된 값이 있는지 검사하여 flag값을 토글링
			if (i > 0) {
				for (int j = (i - 1); j >= 0; j--) {
					if (lotto[j] == lotto[i]) { // 중복된 값이 있다면
						flag = true; // flag값을 true로 토글링
						break;
					}
				}
			}

			// 중복된 값이 있는 경우의 처리
			if (flag == true) {
				i--; // i값을 낮추어서 for문 반복 횟수를 한번 증가시킴(번호 다시 생성)
				flag = false; // flag값을 다시 flase로 토글링
				continue;
			}

		}

		// 생성된 번호 출력
		for (int n : lotto) { // 확장 for문
			System.out.print(n + "\t");
		}

	}
}
