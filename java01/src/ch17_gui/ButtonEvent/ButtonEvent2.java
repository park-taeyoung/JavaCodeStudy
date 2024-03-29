package ch17_gui.ButtonEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent2 extends JFrame implements ActionListener{
	
	private JButton button1,button2,button3,button4,button5,button6;
	
	public ButtonEvent2() {
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
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		
		// 프레임 설정		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e);
		// 버튼의 아이디 값, 소스는 중복이 안된다. 
//		System.out.println(e.getSource());
		if(e.getSource()==button1) {
			getContentPane().setBackground(Color.red);
		} else if(e.getSource()==button2) {
			getContentPane().setBackground(Color.green);
		} else if(e.getSource()==button3) {
			getContentPane().setBackground(Color.blue);
		} else if(e.getSource()==button4) {
			getContentPane().setBackground(Color.white);
		} else if(e.getSource()==button5) {
			getContentPane().setBackground(Color.yellow);
		} else
			getContentPane().setBackground(Color.cyan);
	}

	public static void main(String[] args) {
		new ButtonEvent2();
	}
}
