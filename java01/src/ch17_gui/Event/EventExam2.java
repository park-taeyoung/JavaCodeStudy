package ch17_gui.Event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
// 이벤트 처리하는 방법 (2. 현재 클래스에서 인터페이스 구현)
public class EventExam2 extends Frame implements WindowListener{
	public EventExam2() {
		// 이벤트의 대상.이벤트감시자( 이벤트를 처리하는 객체 )
		// 이벤트소스.이벤트리스너( 이벤트핸들러 )
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
		JOptionPane.showMessageDialog(null, "프로그램 종료");
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
