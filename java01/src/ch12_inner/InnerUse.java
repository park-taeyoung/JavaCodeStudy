package ch12_inner;
// InnerUse.class
// InnerUse$1.classs
// �ܺ�Ŭ����$��ȣ.class�� �����ϵ�
public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {
			@Override
			public void takeOff() {
				System.out.println("takeOff...");
			}
			@Override
			public void fly() {
				System.out.println("fly...");
			}
			@Override
			public void land() {
				System.out.println("land...");
			}
		};
		f.takeOff();
		f.fly();
		f.land();
	}
}


//	# �⺻ Ŭ����
//	class Ŭ�����̸� {
//		
//	}
//	
//	# ���� Ŭ����, �͸� Ŭ����
//	new �ڷ���() {
//		
//	}

