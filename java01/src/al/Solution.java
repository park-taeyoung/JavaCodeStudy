package al;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 80, 45, 87 };
		int[] speeds = { 1, 30, 5, 7, 4 };
		int day = 0;
		int temp = 0;
		int cnt = 0;
		ArrayList<Integer> success = new ArrayList<Integer>();
		ArrayList<Integer> release = new ArrayList<Integer>();
		// progresses �� �Ϸ�Ǵµ� �ɸ��� day�� ���� �� success �迭�� ����
		for (int i = 0; i < progresses.length; i++) {
			while (progresses[i] < 100) {
				progresses[i] += speeds[i];
				day++;
			}
			success.add(day);
			day = 0;
		}

		// �Ϸ�ð��� ������ ���ϰ�, ���� �� ���� ������ �� �ִ� progresses���� ����
		System.out.println("������ �������� ���α׷� ���߿Ϸ� �ϼ� : " + success);
		release.add(cnt);
		for (int i = 0; success.get(i + 1) < success.get(0); i++) {
				release.add(cnt);
			System.out.println(release);
		}
		
		for (int i = release.size(); success.get(i + 1) < success.get(release.size()); i++) {
			
		}
		
	}
}
