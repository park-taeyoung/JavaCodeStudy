package ch16_thread;
public class RunnableExam implements Runnable {
// ������ �۾������� ����Ǹ鼭 ��������.
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// ����Ŭ������ �ν��Ͻ�(��ü) ����
		RunnableExam e1 = new RunnableExam();
		// ������ ���� new Thread(Runnable�� ������ ��ü)
		Thread t1 = new Thread(e1, "������1"); // �����尡 �߰� ������
		Thread t2 = new Thread(e1, "������2");
//		Thread t1 = new Thread(e1); // �����尡 �߰� ������
//		Thread t2 = new Thread(e1);
//		t1.setName("������1");
//		t2.setName("������2");
		t1.start(); // ������ ���� ��û -> run()�� �����
		t2.start();
	}
}