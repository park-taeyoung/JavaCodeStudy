package al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Function {
	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };

		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> answerList = new ArrayList<>();

		int cnt = 0;
		int resultIndex = 0;
		int previousVal = 0;

		for (int i = 0; i < progresses.length; i++) {
			int remainder = 100 - progresses[i];
			System.out.println(remainder + "\t");
			int workday = remainder % speeds[i] == 0 ? remainder / speeds[i] : remainder / speeds[i] + 1;
			queue.offer(workday);
			System.out.println("queue : " + queue + "\t");
		}
		
		while (!queue.isEmpty()) {
			int presentVal = queue.poll();
			System.out.println("queue : " + presentVal + "\t");
			System.out.println("presentVal : " + presentVal + "\t");
			System.out.println("previousVal : " + previousVal + "\t");
			if (previousVal == 0) {
				previousVal = presentVal;
				System.out.println("previousVal : " + previousVal + "\t");
				answerList.add(++cnt);
				System.out.println("answerList1 : " + answerList + "\t");

			} else {
				if (previousVal >= presentVal) {
					answerList.set(resultIndex, ++cnt);
					System.out.println("resultIndex : " + resultIndex + "\t");
					System.out.println("answerList2 : " + answerList + "\t");
				} else {
					previousVal = presentVal;
					System.out.println("presentVal3 : " + presentVal + "\t");
					System.out.println("previousVal3 : " + previousVal + "\t");
					resultIndex++;
					System.out.println("resultIndex3 : " + resultIndex + "\t");
					cnt = 1;
					answerList.add(cnt);
					System.out.println("answerList3 : " + answerList + "\t");
				}
			}
		}
		// return answerList.stream().mapToInt(i -> i).toArray();
		answerList.stream().mapToInt(i -> i).toArray();
		System.out.println(answerList + "\t");		
		
	}
}