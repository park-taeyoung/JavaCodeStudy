package ch17_gui.Frame;

import javax.swing.JFrame;

public class FrameExam2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("������ �׽�Ʈ");
		f.setSize(300, 300);
		f.setVisible(true);
		
		// â�ݱ� ��ư�� �����ø� ���α׷��� �����Ŵ
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
