package ch17_gui.Event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class EventExam1_1 extends Frame{
	public EventExam1_1() {
		setSize(300, 300); // 프레임의 사이즈 설정
		setVisible(true); // 프레임을 화면에 표시
		// 이벤트소스.이벤트리스너(이벤트핸들러)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new EventExam1_1();
	}
}
