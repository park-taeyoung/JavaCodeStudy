package ch16_thread;

public class MyThread extends Thread{
	// 매개변수가 있는 생성자 추가
	public MyThread(String name) {
		super(name); // Thread 클래스의 생성자 호출
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
