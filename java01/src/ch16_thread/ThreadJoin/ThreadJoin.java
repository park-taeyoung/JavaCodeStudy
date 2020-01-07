package ch16_thread.ThreadJoin;

public class ThreadJoin extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드 시작...");
		for(int i = 1; i<=2; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println(Thread.currentThread().getName()+"스레드 종료...");		
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드 시작...");
		ThreadJoin e = new ThreadJoin();
		e.setName("백그라운드 스레드");
		e.start();
		try {
			e.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드 종료...");		
	}
}
