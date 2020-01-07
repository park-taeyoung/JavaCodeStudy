package ch16_thread.S35_ATM;

public class Sync {
	public static void main(String[] args) {
		// 스레드를 상속받은 클래스의 객체 생성
		ATM atm = new ATM();
		
		// 스레드 생성 new Thread(스레드 구현 클래스, 스레드 이름)
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		// 스레드 실행 요청, run()이 실행됨
		mother.start();
		son.start();
	}
}
