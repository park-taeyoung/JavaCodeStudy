package ch11_abstract;

import java.awt.Color;
import java.awt.Graphics;

public class DrawCircle extends Point implements Draw {
	private int width, height;
	public DrawCircle() {
		// 'this.' 하면 변수나 method를 가리키는 거고
		
		this(0,0,0,0);
	}
	public DrawCircle(int a, int b, int w, int h) {
		super(a, b);
		width = w;
		height = h;
	}
	
	// Graphics : 자바의 내장 그래픽 처리 클래스
	@Override
	public void paint(Graphics g) {
		// 타원 그리기
		g.drawOval(a, b, width, height);
		g.setColor(Color.cyan);
		g.fillOval(a+100, b+100, width, height);
	}
}


