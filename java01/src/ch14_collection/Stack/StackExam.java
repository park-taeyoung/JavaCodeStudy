package ch14_collection.Stack;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		String[] nation = {"�ѱ�", "�Ϻ�", "�߱�", "�̱�", "����" };

		// ���� ��ü
		Stack s = new Stack();
		
		// Ȯ�� for�� (���ξ����� : ���յ�����)
		for( String str : nation) {
			// ���ÿ� Ǫ��(�Է�)
			s.push(str);
		}
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
		while(!s.isEmpty()) {
			// ���ÿ��� ��(���)
			System.out.println(s.pop());
		}
	}
}