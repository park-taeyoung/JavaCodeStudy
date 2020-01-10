package ch16_thread.S35_Priority;
// ������ �켱����
public class Priority extends Thread{
	public Priority(String name) {
		super(name);
	}
	public static void main(String[] args) {
		Priority e1 = new Priority("������1");
		Priority e2 = new Priority("������2");
		// �������� �켱���� ����(1~10)
		// �켱������ �����Ѵٰ� �ؼ� �ݵ�� ����Ǵ� ���� �ƴ�
		// Thread.MAX_PRIORITY �ִ� �켱����(10)
		// Thread.MIN_PRIORITY �ּ� �켱����(1)
		// Thread.NORM_PRIORITY �⺻ �켱����(5)
		e2.setPriority(Thread.MAX_PRIORITY);
		e1.start();
		e2.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<=50; i++) { // �ڷᰡ ���� ����ð��� ����� ȿ���� ��Ÿ����.
			System.out.println(Thread.currentThread().getName()+"_"+i);
		}
	}
}