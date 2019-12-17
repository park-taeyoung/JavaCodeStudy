package ch11_abstract;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawUse extends Applet {
	Draw shape1;
	Draw shape2;
	public DrawUse() {
		shape1 = new DrawCircle(30, 30, 60, 80);
		shape2 = new DrawLine(10, 20, 150, 100);
		setBackground(Color.orange); // ������ ����
	}
	
	@Override
	public void paint(Graphics g) {
		// drawString("���ڿ�", x, y)
		g.drawString("�ڹ� �׷���", 100, 60);
		shape1.paint(g);
		shape2.paint(g);
	}
	
}


