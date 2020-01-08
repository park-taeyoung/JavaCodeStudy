package ch17_gui.Panel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	public PanelExam() {
		JPanel p = new JPanel(); // 패널 생성
		p.setBackground(Color.yellow); // 패널의 배경색상 설정
		JButton button1 = new JButton("버튼1"); // 버튼 생성
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		p.add(button1); // 패널에 버튼을 붙임
		p.add(button2);
		p.add(button3);
		this.add(p); // 프레임에 패널을 붙임
		this.setSize(300, 300); // 프레임의 사이즈 설정
		this.setVisible(true); // 프레임을 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 설정
	}
	
	public static void main(String[] args) {
		new PanelExam();
	}
}
