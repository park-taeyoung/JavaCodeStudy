package ch12_inner;
// �������̽� : �߻� method + ���
public interface Flyer {
	// final �ѹ� ���õǸ� ������ �ʴ´�.
	// static �ѹ� �޸𸮿� �ö󰡸� ���������� ������ �ʴ´�.
	// �������̽����� ����� ����������, �Ϲ����� ������
	// ��� �Ұ��� �ϴ�. ��) public int MAX: <- ��������.
	// public static final int MAX = 100;
	public void takeOff();
	public void fly();
	public void land();
//	public static void methodA() {
//		
//	}
//	public default void methodB() {
//		
//	}
}