package ch16_thread;

public class SingleThead {
	
	static void print() {
		// Thread.currentThread().getName()
		// 하게 되면 현재실행중인 스레드의 이름을 알 수 있다.
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		print();
		print();
	}
}
