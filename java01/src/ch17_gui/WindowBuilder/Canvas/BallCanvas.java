package ch17_gui.WindowBuilder.Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Random;
// Canvas : �׷��� ó���� ���� ������Ʈ
// Runnable : ��Ƽ������ ������ ���� �������̽�
// ComponentListener : ȭ�� ������ ������ �����ϱ� ���� �������̽�
public class BallCanvas extends Canvas implements Runnable, ComponentListener{
	
	private int x, y;
	private int moveX = 2, moveY = 3;
	private int red, green, blue;
	private Random random;
	private int width, height;
	
	// ���� ���۸� ó���� ���� ���� �߰�
	// ��׶��� �̹��� ����(��ȭ�� ����)
	private Image offImage;
	
	// ��׶��� �̹����� �׷��� ����� ���� ��ü (�� ����)
	private Graphics bg;
	
	public BallCanvas() {
		// ȭ�� ���� ������ �����ϱ� ���� ������ �߰�
		addComponentListener(this);
		
		// ���� ���� ó���� ���� ���� ��ü ����
		random = new Random();
		
		// ��ǥ�� ������ ���� ��׶��� ������ ����
		Thread thread = new Thread(this);
		
		// ��׶��� ������ ���� ��û
		thread.start(); // run()�� ȣ���
		
		// repaint() --> update() --> paint()
	}
	
	// �׷��� ȭ�鿡 ����ϱ� ���� ����Ǵ� �ڵ�
	@Override
	public void update(Graphics g) {
		Dimension d = getSize(); // ȭ�� ������ ���
		
		// ��׶��� �̹����� �ѹ��� ����
		if(offImage == null) {
			offImage = createImage(d.width, d.height);
			bg = offImage.getGraphics();
		}
		
		bg.setColor(getBackground()); // ������
		bg.fillRect(0, 0, d.width, d.height); // ȭ�� Ŭ����
		bg.setColor(new Color(red, green, blue));
		bg.fillOval(x, y, 20, 20);
		paint(g);
	}
	
	public void paint(Graphics g) {
		if(offImage != null) {
			g.drawImage(offImage, 0, 0, null);
		}
//		// ���� ����
//		g.setColor(new Color(red, green, blue));
//		
//		// Ÿ���׸���
//		g.fillOval(x, y, 20, 20);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// ���� ���� ���� ȭ���� ����, ���� ���� ���
		width = getWidth();
		height = getHeight();
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentShown(ComponentEvent e) {
	}

	@Override
	public void componentHidden(ComponentEvent e) {
	}
	
	void setColor() {
		red = random.nextInt(256); // 0~255
		green = random.nextInt(256);
		blue = random.nextInt(256);
	}

	@Override
	public void run() {
		while(true) {
			if(x>(width-20) || x<0) { // �¿� ��ó��
				moveX =-moveX; // ����, ���� ���� ����
				setColor();
			}
			if(y>(height-20) || y<0) { // ���� ��ó��
				moveY =-moveY;
				setColor();
			}
			x += moveX; // x��ǥ�� ����
			y += moveY; // y��ǥ�� ����
			repaint(); // �׷��� ���� ��û --> paint() �� �����
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}