package ch16_thread.BufferingAnim;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BufferingAnim extends Applet implements Runnable{
	private Image[] img; // �̹��� ��ü�迭
	private int idx; // �̹����� �ε���
	private Image offImage; // ��׶��� �̹��� ��ü
	private Graphics bg; // ��׶��� �׷��� ó�� ��ü

	public void init() {
		img = new Image[10];
		for(int i=0; i<img.length; i++) {
			img[i]=Toolkit.getDefaultToolkit().getImage(getClass().getResource("kim"+(i+1)+".png"));
		}
		Thread t = new Thread(this);
		t.start();
		setSize(1300, 720); // ȭ������� ����
	}
	
	@Override
	public void run() {
		while(true) {
			idx++;
			if(idx>=10) {
				idx=0;
			}
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void update(Graphics g) {
		Dimension d = getSize(); // ���� ȭ���� ������ ���
		if(offImage==null) {
			offImage = createImage(d.width, d.height);
			bg=offImage.getGraphics();
		}
		bg.setColor(getBackground()); // �׷��� ���� ����
		bg.fillRect(0, 0, d.width, d.height); // �簢�� �׸���, (0,0)�� ���� ����� �׸��� ����� ȿ��
		bg.drawImage(img[idx], 0, 0, null); // �̹��� ���
		paint(g); // ȣ��
	}
	
	// �׷��� ó�� �ڵ� (ȭ�� ��� ó��)
	public void paint(Graphics g) {
		if(offImage != null ) { // ��׶��� �̹����� �����ϸ�
		g.drawImage(offImage,  10,  0,  this); // ��׶��� �̹����� ���� ȭ�鿡 ��½�Ŵ
		}
	}	
}
