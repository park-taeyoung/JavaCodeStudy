package ch17_gui.Frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameExam {
	public static void main(String[] args) {
		// ������ ����
		Frame f = new Frame();
		
		// �������� ���� ����
		f.setTitle("������ �׽�Ʈ");
		
		// �������� ����, ���� ������ ����
		f.setSize(300, 300);
		
		// �������� ȭ�鿡 ǥ��
		f.setVisible(true);
		
//		�����ӿ� ������ �̺�Ʈ�� �����ϴ� ������ ����� ����
//		�����찡 ������ ���α׷��� ������ ������
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 0 �������� ����
			}
		});
	}
}
