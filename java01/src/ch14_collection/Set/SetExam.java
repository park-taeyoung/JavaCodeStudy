package ch14_collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		//�ߺ����� ������� ����
		Set<String> hs = new HashSet<String>();
		
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea"); // �Էµ��� ����
		
		System.out.println("[for������ ���]");
		for (String str : hs) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("[iterator�� ���]");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}