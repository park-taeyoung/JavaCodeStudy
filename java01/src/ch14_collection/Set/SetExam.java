package ch14_collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		//중복값을 허용하지 않음
		Set<String> hs = new HashSet<String>();
		
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea"); // 입력되지 않음
		
		System.out.println("[for문으로 출력]");
		for (String str : hs) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("[iterator로 출력]");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
