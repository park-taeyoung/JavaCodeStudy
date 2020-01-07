package ch16_thread.S35_ATM;

public class ATM extends Thread{
	private long depositMoney = 100000;
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			withDraw(10000);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

//	private synchronized void withDraw(int money) {
//		if(depositMoney > 0) {
//			depositMoney -= money;
//			System.out.println(Thread.currentThread().getName()+"-�ܾ�: "+depositMoney);
//		} else {
//			System.out.println(Thread.currentThread().getName()+"-�ܾ��� �����ϴ�.");
//		}
//	}

	private  void withDraw(int money) {
		synchronized (this) {
			if(depositMoney > 0) {
				depositMoney -= money;
				System.out.println(Thread.currentThread().getName()+"-�ܾ�: "+depositMoney);
			} else {
				System.out.println(Thread.currentThread().getName()+"-�ܾ��� �����ϴ�.");
			}
		}
	}
}










