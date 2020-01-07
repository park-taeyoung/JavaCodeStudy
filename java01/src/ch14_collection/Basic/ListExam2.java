package ch14_collection.Basic;

import java.util.ArrayList;
import java.util.Random;

public class ListExam2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random r = new Random();
		int sum = 0;
		
		// ArrayList에는 다양한 자료형을 저장할 수 있음
		list.add(r.nextInt(46)-1);
		list.add(r.nextInt(46)-1);
		list.add(r.nextInt(46)-1);
		list.add(r.nextInt(46)-1);
		list.add(r.nextInt(46)-1);
		list.add(r.nextInt(46)-1);
		
//		list.add(7);
//		list.add(28);
//		list.add(37);
//		list.add(7);
//		list.add(35);
//		list.add(16);
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			sum += list.get(i);
			for (int j = 0; j < i ; j++) {
				if(list.get(i).equals(list.get(j))) {
					System.out.print("중복값있음");
					}
				}
		}
		System.out.println(sum);
		
			
		
	}
}
