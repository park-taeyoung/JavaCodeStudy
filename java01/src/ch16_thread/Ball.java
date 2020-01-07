package ch16_thread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

// 멀티 스레드 구현해야 하니깐 Runnable 인터페이스 구현했다.
public class Ball extends Applet implements Runnable, ComponentListener{
	private int x, y;
	private int mx=2, my=3;
	private int width, height;
	// 애플릿을 초기화시키는 코드
	public void init() {
		// 현재클래스에 컴포넌트 리스터 추가, 화면사이즈변경, 움직임을 감지
		addComponentListener(this);
		
		Thread t = new Thread(this); // 백그라운드 스레드 생성
		t.start(); // 백그라운드 스레드 실행 요청
		setBackground(Color.yellow); // 배경색상 설정
		setSize(300, 300); // 화면 사이즈 설정
	}
	// 화면 출력 코드(그래픽 처리)
	public void paint(Graphics g) {
		g.setColor(Color.red); // 색상 설정
		g.fillOval(x, y, 30, 30); // 타원그리기
		g.setColor(Color.blue);
		g.drawString("hello", y, x); // 문자열 출력
	}
	@Override
	public void run() {
		while(true) {
			if(x > (width-30) || x<0 ) { // 좌우벽에 맞으면
				mx = -mx; // x축의 방향 전환
			}
			x = x + mx;
			if(y > (height-30) || y<0 ) { // 상하벽에 맞으면
				my = -my; // y축의 방향전환
			}
			y = y + my;
			repaint(); // paint()가 실행됨
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void componentResized(ComponentEvent e) {
		width = getWidth(); // 현재 화면의 가로 사이즈 저장
		height = getHeight(); // 현재 화면의 세로 사이즈 저장
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
















