package ch16_thread;

public class MyThread extends Thread{
	// �Ű������� �ִ� ������ �߰�
	public MyThread(String name) {
		super(name); // Thread Ŭ������ ������ ȣ��
	}
	@Override
	public void run() {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}