package ch16_thread;

public class SingleThead {
	
	static void print() {
		// Thread.currentThread().getName()
		// �ϰ� �Ǹ� ����������� �������� �̸��� �� �� �ִ�.
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
