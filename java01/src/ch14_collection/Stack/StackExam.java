package ch14_collection.Stack;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		String[] nation = {"한국", "일본", "중국", "미국", "영국" };

		// 스택 객체
		Stack s = new Stack();
		
		// 확장 for문 (세부아이템 : 집합데이터)
		for( String str : nation) {
			// 스택에 푸쉬(입력)
			s.push(str);
		}
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
		while(!s.isEmpty()) {
			// 스택에서 팝(출력)
			System.out.println(s.pop());
		}
	}
}
