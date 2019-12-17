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
		// progresses 가 완료되는데 걸리는 day을 구한 후 success 배열에 저장
		for (int i = 0; i < progresses.length; i++) {
			while (progresses[i] < 100) {
				progresses[i] += speeds[i];
				day++;
			}
			success.add(day);
			day = 0;
		}

		// 완료시간을 가져와 비교하고, 배포 때 마다 배포될 수 있는 progresses수를 저장
		System.out.println("배포전 순차적인 프로그램 개발완료 일수 : " + success);
		release.add(cnt);
		for (int i = 0; success.get(i + 1) < success.get(0); i++) {
				release.add(cnt);
			System.out.println(release);
		}
		
		for (int i = release.size(); success.get(i + 1) < success.get(release.size()); i++) {
			
		}
		
	}
}
