package ch15_exception;
//# ���� ó�� ���
//try  catch ����ó��
//throws ����ó�� Ŭ������ ó�� ����
//�޼ҵ� �̸� throws ����ó�� Ŭ����1, ����ó�� Ŭ���� 2
//main method ������ �ڵ带 �����ϴٰ� ���ܰ� �߻��ϸ�
//���� ó������ �ʰ�  throws �ڿ� ������ ����ó�� Ŭ������ ó���� ����

public class ThrowsExam {
	public static void main(String[] args)
			throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000); // Thread ���α׷��ȿ��� ����Ǵ� �۾�����. 1�� ����
		}
	}
}