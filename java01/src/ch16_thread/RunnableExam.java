package ch16_thread;
public class RunnableExam implements Runnable {
// 여러개 작업단위가 실행되면서 빨라진다.
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
		// 현재클래스의 인스턴스(객체) 생성
		RunnableExam e1 = new RunnableExam();
		// 스레드 생성 new Thread(Runnable을 구현한 객체)
		Thread t1 = new Thread(e1, "스레드1"); // 스레드가 추가 생성됨
		Thread t2 = new Thread(e1, "스레드2");
//		Thread t1 = new Thread(e1); // 스레드가 추가 생성됨
//		Thread t2 = new Thread(e1);
//		t1.setName("스레드1");
//		t2.setName("스레드2");
		t1.start(); // 스레드 실행 요청 -> run()이 실행됨
		t2.start();
	}
}
