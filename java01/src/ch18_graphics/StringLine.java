package ch18_graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet {
	@Override
	public void init() {
		//getContentPane().setBackground(new Color(255,255,0)); // ������ ����
		getContentPane().setBackground(Color.yellow); // ������ ����
		setSize(300, 300); // ȭ��ũ�� ����
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		// ù setColor�� ���� setColor ������ ������ ���ӵȴ�.
		// setColor�� �������� ������ ����Ʈ ������ black �̴�.
		
		g.setColor(Color.blue); // ���� ����
		g.drawLine(250, 50, 30, 160); // �� �׸���
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50); // ���ڿ� ���
		g.setColor(Color.GREEN);
		g.drawString("Green string",  10,  80);
		g.setColor(Color.blue);
		g.drawString("Blue string",  10,  110);
	}
}