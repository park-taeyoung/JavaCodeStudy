package ch18_graphics;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font; // 글꼴 관련 객체
	private FontMetrics fm; // 폰트 관련 정보 제공 객체
	private int x=100, y=100;
	private String message;
	private Dimension dim; // 화면 가로, 세로 사이즈를 저장하는 객체
	
	// 화면 출력 전에 할 초기화 작업들
	@Override
	public void init() {
		message = "그래픽 테스트";
		// 폰트 설정 new Font("폰트이름", 옵션, 사이즈)
		font = new Font("굴림", Font.BOLD, 30);
		setSize(250, 250); // 화면 사이즈 설정
		
		fm = getFontMetrics(font);
		dim = getSize(); // 현재 화면의 사이즈
		System.out.println(x+","+y);
		x = (dim.width/2) - (fm.stringWidth(message)/2);
		// getDescent() 문자열의 세로 길이
		y = (dim.height/2) - (fm.getDescent()/2);
		
		
	}
	
	
	// 화면 출력 처리 코드
	@Override
	public void paint(Graphics g) {
		// 그래픽 화면에 사용할 폰트 변경
		g.setFont(font);;
		// 그래픽 화면에 문자열 출력
		g.drawString(message,  x,  y);
	}
	
}
