package ch17_gui.Event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class EventExam1_1 extends Frame{
	public EventExam1_1() {
		setSize(300, 300); // �������� ������ ����
		setVisible(true); // �������� ȭ�鿡 ǥ��
		// �̺�Ʈ�ҽ�.�̺�Ʈ������(�̺�Ʈ�ڵ鷯)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new EventExam1_1();
	}
}
