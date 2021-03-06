package ch16_thread.Anim;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Anim extends Applet implements Runnable{
	private Image[] img;
	private int idx;

	public void init() {
		img = new Image[10];
		for(int i=0; i<img.length; i++) {
			img[i]=Toolkit.getDefaultToolkit().getImage(getClass().getResource("kim"+(i+1)+".png"));
		}
		Thread t = new Thread(this);
		t.start();
		setSize(1300, 720); // 화면사이즈 설정
	}
	
	public void paint(Graphics g) {
		g.drawImage(img[idx],  10,  0,  this);
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
}
