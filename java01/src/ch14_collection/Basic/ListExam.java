package ch14_collection.Basic;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		// ArrayList���� �پ��� �ڷ����� ������ �� ����
		list.add("�ϳ�");
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