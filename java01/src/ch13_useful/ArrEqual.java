package ch13_useful;

import java.util.Arrays;

public class ArrEqual {
	public static void main(String[] args) {
		int[] num1 = {10, 20, 30, 40, 50};
		int[] num2 = {10, 20, 30, 40, 50};
		// Arrays.euqals(�迭1, �迭2) -> �� �迭�� ������ ��
		if(Arrays.equals(num1, num2)) {
			System.out.println("�迭�� ������ �����ϴ�.");
		} else {
			System.out.println("�迭�� ������ �ٸ��ϴ�.");
		}
	}
}
