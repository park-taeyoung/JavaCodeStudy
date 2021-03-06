package ch14_collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		
		//중복이 허용되지 않고 정렬도 됨
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("korea");
		ts.add("japan");
		ts.add("america");
		ts.add("britain");
		ts.add("korea"); // 입력되지 않음
		
		System.out.println("[for문으로 출력]");
		for (String str : ts) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("[iterator로 출력]");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
