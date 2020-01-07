package ch14_collection.Basic;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		// ArrayList에는 다양한 자료형을 저장할 수 있음
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4);
		list.add(5);
		list.remove(0);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	}
}
