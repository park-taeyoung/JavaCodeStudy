package ch17_gui.Event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
// �̺�Ʈ ó���ϴ� ��� (2. ���� Ŭ�������� �������̽� ����)
public class EventExam2 extends Frame implements WindowListener{
	public EventExam2() {
		// �̺�Ʈ�� ���.�̺�Ʈ������( �̺�Ʈ�� ó���ϴ� ��ü )
		// �̺�Ʈ�ҽ�.�̺�Ʈ������( �̺�Ʈ�ڵ鷯 )
		this.addWindowListener(this);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new EventExam2();
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(null, "���α׷� ����");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
	}
	@Override
	public void windowIconified(WindowEvent e) {
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
	}
	@Override
	public void windowActivated(WindowEvent e) {
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
	}
}
