package ch17_gui.Event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class EventExam1 extends Frame{
	public EventExam1() {
		setSize(300, 300); // 프레임의 사이즈 설정
		setVisible(true); // 프레임을 화면에 표시
		// 이벤트소스.이벤트리스너(이벤트핸들러)
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
				// 메시지 박스 출력
				JOptionPane.showMessageDialog(null, "프로그램 종료");
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
