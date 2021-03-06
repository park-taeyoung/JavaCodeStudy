package ch17_gui.ButtonEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent3 extends JFrame {
	private JButton button1,button2,button3,button4,button5,button6;
	public ButtonEvent3() {
		// JFrame의 기본레이아웃은 BorderLayout으로 이걸 사용하지 않고
		// 플로우 레이아웃으로 변경
		setLayout(new FlowLayout());
		// 버튼 객체 생성
		button1 = new JButton("Red");
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		// 프레임을 버튼에 붙임
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		// 버튼에 이벤트 기능 추가
		// 이벤트소스.이벤트리스너( 이벤트핸들러 )
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
		// 프레임 설정		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ButtonEvent3();
	}
}
