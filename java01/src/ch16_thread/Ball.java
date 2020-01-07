package ch16_thread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

// ��Ƽ ������ �����ؾ� �ϴϱ� Runnable �������̽� �����ߴ�.
public class Ball extends Applet implements Runnable, ComponentListener{
	private int x, y;
	private int mx=2, my=3;
	private int width, height;
	// ���ø��� �ʱ�ȭ��Ű�� �ڵ�
	public void init() {
		// ����Ŭ������ ������Ʈ ������ �߰�, ȭ��������, �������� ����
		addComponentListener(this);
		
		Thread t = new Thread(this); // ��׶��� ������ ����
		t.start(); // ��׶��� ������ ���� ��û
		setBackground(Color.yellow); // ������ ����
		setSize(300, 300); // ȭ�� ������ ����
	}
	// ȭ�� ��� �ڵ�(�׷��� ó��)
	public void paint(Graphics g) {
		g.setColor(Color.red); // ���� ����
		g.fillOval(x, y, 30, 30); // Ÿ���׸���
		g.setColor(Color.blue);
		g.drawString("hello", y, x); // ���ڿ� ���
	}
	@Override
	public void run() {
		while(true) {
			if(x > (width-30) || x<0 ) { // �¿캮�� ������
				mx = -mx; // x���� ���� ��ȯ
			}
			x = x + mx;
			if(y > (height-30) || y<0 ) { // ���Ϻ��� ������
				my = -my; // y���� ������ȯ
			}
			y = y + my;
			repaint(); // paint()�� �����
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void componentResized(ComponentEvent e) {
		width = getWidth(); // ���� ȭ���� ���� ������ ����
		height = getHeight(); // ���� ȭ���� ���� ������ ����
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
















