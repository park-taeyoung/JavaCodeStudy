package ch17_gui.ButtonEvent;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private Color c; // 색상 변수
	private Container con; // 컨테이너 변수
	
	// 생성자
	public MyColorAction(JFrame f, Color c) {
		con = f.getContentPane(); // 프레임의 컨텐츠 영역
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c); // 배경색상 변경
	}
}
