package ch15_exception;
// throw : ���ܸ� ���� �߻���Ű�� ���
public class ThrowExam {
	// throw new ����ó��Ŭ����();  Ư���� ���ǿ� ���������� ���ܸ� �߻���Ŵ
	static void test(int n) {
		if(n==0) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		test(0);
	}
}
