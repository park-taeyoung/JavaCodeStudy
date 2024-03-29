package ch16_thread;

public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(name); // 부모클래스(Thread)의 생성자 호출
	}
	public void run() {
		for(int i=1; i <= 2; i++ ) {
			//현재 실행중인 스레드의 이름 출력
			System.out.println(Thread.currentThread().getName());
			//CPU의 실행을 1초간 멈춤
			try {
				System.out.println("-------------");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// 스레드 생성
		ThreadExam e1 = new ThreadExam("스레드1");
		ThreadExam e2 = new ThreadExam("스레드2");
		ThreadExam e3 = new ThreadExam("스레드3");
		// 스레드 실행
		e1.start();
		e2.start();
		e3.start();
	}
}
