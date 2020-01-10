package ch16_thread.BufferedBall;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
// ���� ���۸�
public class BufferedBall extends Applet implements Runnable{
	private int x, y; // ���� ��ǥ
	private int moveX = 2, moveY = 3; // x, y���� �̵��Ÿ�
	private int width, height;  // ȭ�� ����, ���� ������
	private Graphics bg; // ��׶��� �̹����� �׷��� ó���� �ϱ� ���� ��ü
	private Image offScreen; // ��׶��� �̹��� ��ü
	private Dimension dim; // ȭ���� ����, ���� ũ�� ���
	
	// ���ø��� �ʱ�ȭ ��Ű�� �ڵ�
	public void init() {
		setSize(300, 300); // ȭ���� ����, ���� ������ ����
		dim = getSize(); // ȭ�� ����� ����
		offScreen = createImage(dim.width, dim.height); // ��׶��� �̹��� ����
		bg = offScreen.getGraphics(); // ��׶��� �̹����� �׷��� ó���� �ϱ� ���� ��ü ����
		Thread t = new Thread(this); // ��׶��� ������ ����
		t.start(); // ��׶��� ������ ���� ��û
	}
	
	
	@Override
	public void run() {
		while(true) { // ���ѹݺ�
			if(x > (dim.width-30) || x<0 ) { // �¿캮�� ������
				moveX = -moveX; // x���� ���� ��ȯ
			}
			x = x + moveX;
			if(y > (dim.height-30) || y<0 ) { // ���Ϻ��� ������
				moveY = -moveY; // y���� ������ȯ
			}
			y = y + moveY;
			repaint(); // paint()�� �����
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g) {
		bg.setColor(Color.yellow); // ���� ����
		bg.fillRect(0, 0, getWidth(), getWidth());
		bg.setColor(Color.green);
		bg.fillOval(x, y, 30, 30); // Ÿ���׸���
		bg.setColor(Color.blue);
		bg.drawString("hello", y, x); // ���ڿ� ���
		g.drawImage(offScreen, 0, 0, this);
	}
}