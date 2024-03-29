package ch16_thread.BufferedBall;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
// 더블 버퍼링
public class BufferedBall extends Applet implements Runnable{
	private int x, y; // 원의 좌표
	private int moveX = 2, moveY = 3; // x, y축의 이동거리
	private int width, height;  // 화면 가로, 세로 사이즈
	private Graphics bg; // 백그라운드 이미지에 그래픽 처리를 하기 위한 객체
	private Image offScreen; // 백그라운드 이미지 객체
	private Dimension dim; // 화면의 가로, 세로 크기 계산
	
	// 애플릿을 초기화 시키는 코드
	public void init() {
		setSize(300, 300); // 화면의 가로, 세로 사이즈 설정
		dim = getSize(); // 화면 사이즈를 저장
		offScreen = createImage(dim.width, dim.height); // 백그라운드 이미지 생성
		bg = offScreen.getGraphics(); // 백그라운드 이미지에 그래픽 처리를 하기 위한 객체 생성
		Thread t = new Thread(this); // 백그라운드 스레드 생성
		t.start(); // 백그라운드 스레드 시작 요청
	}
	
	
	@Override
	public void run() {
		while(true) { // 무한반복
			if(x > (dim.width-30) || x<0 ) { // 좌우벽에 맞으면
				moveX = -moveX; // x축의 방향 전환
			}
			x = x + moveX;
			if(y > (dim.height-30) || y<0 ) { // 상하벽에 맞으면
				moveY = -moveY; // y축의 방향전환
			}
			y = y + moveY;
			repaint(); // paint()가 실행됨
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g) {
		bg.setColor(Color.yellow); // 색상 설정
		bg.fillRect(0, 0, getWidth(), getWidth());
		bg.setColor(Color.green);
		bg.fillOval(x, y, 30, 30); // 타원그리기
		bg.setColor(Color.blue);
		bg.drawString("hello", y, x); // 문자열 출력
		g.drawImage(offScreen, 0, 0, this);
	}
}
