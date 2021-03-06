package ch16_thread.S35_Priority;
// 스레드 우선순위
public class Priority extends Thread{
	public Priority(String name) {
		super(name);
	}
	public static void main(String[] args) {
		Priority e1 = new Priority("스레드1");
		Priority e2 = new Priority("스레드2");
		// 스레드의 우선순위 설정(1~10)
		// 우선순위를 설정한다고 해서 반드시 적용되는 것은 아님
		// Thread.MAX_PRIORITY 최대 우선순위(10)
		// Thread.MIN_PRIORITY 최소 우선순위(1)
		// Thread.NORM_PRIORITY 기본 우선순위(5)
		e2.setPriority(Thread.MAX_PRIORITY);
		e1.start();
		e2.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<=50; i++) { // 자료가 많고 실행시간이 길수록 효과가 나타난다.
			System.out.println(Thread.currentThread().getName()+"_"+i);
		}
	}
}
