package ch17_gui.Event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class EventExam1 extends Frame{
	public EventExam1() {
		setSize(300, 300); // �������� ������ ����
		setVisible(true); // �������� ȭ�鿡 ǥ��
		// �̺�Ʈ�ҽ�.�̺�Ʈ������(�̺�Ʈ�ڵ鷯)
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}
			@Override
			public void windowIconified(WindowEvent e) {
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			@Override
			public void windowClosing(WindowEvent e) {
				// �޽��� �ڽ� ���
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				System.exit(0);
			}
			@Override
			public void windowClosed(WindowEvent e) {
			}
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
	}
	public static void main(String[] args) {
		new EventExam1();
	}
}