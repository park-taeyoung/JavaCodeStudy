package ch16_thread.BufferingAnim;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BufferingAnim extends Applet implements Runnable{
	private Image[] img; // 이미지 객체배열
	private int idx; // 이미지의 인덱스
	private Image offImage; // 백그라운드 이미지 객체
	private Graphics bg; // 백그라운드 그래픽 처리 객체

	public void init() {
		img = new Image[10];
		for(int i=0; i<img.length; i++) {
			img[i]=Toolkit.getDefaultToolkit().getImage(getClass().getResource("kim"+(i+1)+".png"));
		}
		Thread t = new Thread(this);
		t.start();
		setSize(1300, 720); // 화면사이즈 설정
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
		Dimension d = getSize(); // 현재 화면의 사이즈 계산
		if(offImage==null) {
			offImage = createImage(d.width, d.height);
			bg=offImage.getGraphics();
		}
		bg.setColor(getBackground()); // 그래픽 색상 설정
		bg.fillRect(0, 0, d.width, d.height); // 사각형 그리기, (0,0)은 전에 출력한 그림을 지우는 효과
		bg.drawImage(img[idx], 0, 0, null); // 이미지 출력
		paint(g); // 호출
	}
	
	// 그래픽 처리 코드 (화면 출력 처리)
	public void paint(Graphics g) {
		if(offImage != null ) { // 백그라운드 이미지가 존재하면
		g.drawImage(offImage,  10,  0,  this); // 백그라운드 이미지를 현재 화면에 출력시킴
		}
	}	
}
