package ch14_collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		
		//�ߺ��� ������ �ʰ� ���ĵ� ��
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("korea");
		ts.add("japan");
		ts.add("america");
		ts.add("britain");
		ts.add("korea"); // �Էµ��� ����
		
		System.out.println("[for������ ���]");
		for (String str : ts) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("[iterator�� ���]");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}