package ch12_inner;

public class InnerFinal {
	private int x = 10;
	void print() {
		//��������(local variable), �ڵ�����
		// ��������  final ���̴°� ���� �� ����.
		final int y=20; 
		class Inner { //method ���ο� ����� ���� Ŭ����
			void test() {
// ����Ŭ���������� �ܺ�Ŭ������ ��� ��������� ���ٰ���
				System.out.println(x);
				// jdk1.8 ���� �������. ���� �޼��� �ȿ����� ��� ����.
				System.out.println(y);
			}
		}
	}
}