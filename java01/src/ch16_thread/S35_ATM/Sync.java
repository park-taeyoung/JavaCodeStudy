package ch16_thread.S35_ATM;

public class Sync {
	public static void main(String[] args) {
		// �����带 ��ӹ��� Ŭ������ ��ü ����
		ATM atm = new ATM();
		
		// ������ ���� new Thread(������ ���� Ŭ����, ������ �̸�)
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		// ������ ���� ��û, run()�� �����
		mother.start();
		son.start();
	}
}
