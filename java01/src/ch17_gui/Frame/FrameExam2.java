package ch17_gui.Frame;

import javax.swing.JFrame;

public class FrameExam2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("프레임 테스트");
		f.setSize(300, 300);
		f.setVisible(true);
		
		// 창닫기 버튼을 누르ㅓ면 프로그램을 종료시킴
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
