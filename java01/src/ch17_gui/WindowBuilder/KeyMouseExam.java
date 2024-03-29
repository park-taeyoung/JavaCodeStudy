package ch17_gui.WindowBuilder;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
// 마우스 이벤트 처리 MouseListener -> MouseEvent
public class KeyMouseExam extends JApplet
							implements MouseListener, KeyListener, MouseMotionListener{
	private int x, y;
	private int width, height;
	private Image img;
	
	// 화면 그리기 전 초기화 시켜주는 메소드
	@Override
	public void init() {
		// 화면 사이즈
		setSize(300, 300);
		
		// 이미지 로딩
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("will.png"));
		
		// 마우스 이벤트 연결
		addMouseListener(this);
		
		// 키이벤트 연결
		addKeyListener(this);
		
		// 마우스 동작이벤트 연결
		addMouseMotionListener(this);
		
		// 키 입력을 받을 수 있도록 설정
		setFocusable(true);
		
		// 현재 화면에 입력포커스 설정
		requestFocus();
	}
	
	// 화면 출력 메소드
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 이미지를 화면에 출력
		g.drawImage(img, x, y, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 이미지의 가로, 세로 사이즈 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		
		// 클릭한 x, y 좌표 저장
		x=e.getX() - (width/2);
		y=e.getY() - (height/2);;
		
		// 그래픽 수정 요청 -> paint() 가 호출됨
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
// ---------------------------------------------------------------------------------
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println(e);
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN:
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT:
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(300-width, x+5); break;
		}
		
		// 그래픽 갱신 요청
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

// ---------------------------------------------------------------------------------

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag... x : "+e.getX()+",y : "+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse drag... x : "+e.getX()+",y : "+e.getY());
	}
}