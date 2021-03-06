package ch11_abstract;

import java.awt.Color;
import java.awt.Graphics;

public class DrawLine extends Point implements Draw {
	private int x, y;
	public DrawLine(int a, int b, int x, int y) {
		super(a, b); // 부모클래스 (Point)의 생성자를 호출
		this.x = x;
		this.y = y;
	}
	@Override
	public void paint(Graphics g) { //Draw interface의 메소드를 오버라이딩
		g.setColor(Color.red);
		g.drawLine(a, b, x, y); // 직선을 그려주는 메소드
	}

}


