package ch15_exception;

public class TryExam {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		try {
			// �迭�� ���� �ʰ�
			for(int i=0; i<=5; i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			System.out.println("�迭�� �ε��� ������ �ʰ��Ǿ����ϴ�.");
		}
	}
}
