package ch13_useful;

import java.util.StringTokenizer;

public class StrToken2 {
	public static void main(String[] args) {
		String str = "apple/banana/grape/melon";
		StringTokenizer st = new StringTokenizer(str,"/");
		int cnt = st.countTokens();
		System.out.println("��ū�� ����: "+cnt);
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}
}
