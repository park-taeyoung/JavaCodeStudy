package ch18_graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet {
	@Override
	public void init() {
		//getContentPane().setBackground(new Color(255,255,0)); // 배경색상 설정
		getContentPane().setBackground(Color.yellow); // 배경색상 설정
		setSize(300, 300); // 화면크기 설정
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// 첫 setColor는 다음 setColor 나오기 전까지 지속된다.
		// setColor를 지정하지 않으면 디폴트 색상은 black 이다.
		
		g.setColor(Color.blue); // 색상 설정
		g.drawLine(250, 50, 30, 160); // 선 그리기
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50); // 문자열 출력
		g.setColor(Color.GREEN);
		g.drawString("Green string",  10,  80);
		g.setColor(Color.blue);
		g.drawString("Blue string",  10,  110);
	}
}
