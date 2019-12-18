package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// F3 : �ҽ� �ڵ� ����
// F4 : ���� ���� ����


// super.��� : �θ�Ŭ������ ��� ȣ��
// super() : �θ�Ŭ������ ������ ȣ��
// this.��� : �� Ŭ������ ��� ȣ��
// this() : �� Ŭ������ ������ ȣ��
// ������ : Ŭ���� �̸��� ���� method
//       ���� Ÿ���� ����
//       ��ü�� ������ �� �ڵ� ȣ��ȴ�.

public class InnerExam extends Frame{
	public InnerExam() {
		super("���� Ŭ���� �׽�Ʈ");
		// �������� ����, ���� ������ ����
		setSize(300, 400);
		// �������� ȭ�鿡 ǥ��
		setVisible(true);
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		
//		�̺�Ʈ(Event) : �ý��۰� ������� ��ȣ �ۿ�
//		�̺�Ʈ�ҽ�.�̺�Ʈ������(�̺�Ʈ�ڵ鷯)
//		�̺���ҽ� : �̺�Ʈ�� ���
//		�̺�Ʈ������ : �̺�Ʈ�� �Ͼ���� �����ϴ� ���
//		�̺�Ʈ�ڵ鷯 : �̺�Ʈ�� �߻����� �� ����Ǵ� �ڵ�
		
		e.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); //���α׷� ���� ����
			}
		});
	}
}



//	class A {
//		class B {
//		}
//	}
//	
//	class A {
//		public void print() {
//			class B {
//			}
//		}
//	}
//	
//	e.addWindowListener(   )

