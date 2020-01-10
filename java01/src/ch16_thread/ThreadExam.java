package ch16_thread;

public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name); // �θ�Ŭ����(Thread)�� ������ ȣ��
	}
	public void run() {
		for(int i=1; i <= 2; i++ ) {
			//���� �������� �������� �̸� ���
			System.out.println(Thread.currentThread().getName());
			//CPU�� ������ 1�ʰ� ����
			try {
				System.out.println("-------------");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// ������ ����
		ThreadExam e1 = new ThreadExam("������1");
		ThreadExam e2 = new ThreadExam("������2");
		ThreadExam e3 = new ThreadExam("������3");
		// ������ ����
		e1.start();
		e2.start();
		e3.start();
	}
}