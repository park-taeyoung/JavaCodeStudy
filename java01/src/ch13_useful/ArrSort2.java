package ch13_useful;

import java.util.Arrays;

public class ArrSort2 {
	public static void main(String[] args) {
		int[] num = {50, 40, 70, 90, 120, -20};
		System.out.println("�����ϱ� ��");
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		Arrays.sort(num);
		System.out.println("\n ���� ��");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}
}
