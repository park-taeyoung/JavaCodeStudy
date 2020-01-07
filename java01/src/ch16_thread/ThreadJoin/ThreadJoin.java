package ch16_thread.ThreadJoin;

public class ThreadJoin extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+"������ ����...");
		for(int i = 1; i<=2; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println(Thread.currentThread().getName()+"������ ����...");		
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"������ ����...");
		ThreadJoin e = new ThreadJoin();
		e.setName("��׶��� ������");
		e.start();
		try {
			e.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"������ ����...");		
	}
}
