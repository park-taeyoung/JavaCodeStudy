package ch17_gui.ButtonEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent1 extends JFrame{

	private JButton button1,button2,button3,button4,button5,button6; 
	
	public ButtonEvent1() {
		// JFrame의 기본레이아웃은 BorderLayout으로 이걸 사용하지 않고
		// 플로우 레이아웃으로 변경
		this.setLayout(new FlowLayout());
		
		// 버튼 객체 생성
		button1 = new JButton("Red");
		button2 = new JButton("Grren");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		
		// 프레임을 버튼에 붙임
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		
		// 프레임 설정
		this.setSize(450, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 버튼에 이벤트 기능 추가
		// 이벤트소스.이벤트리스너( 이벤트핸들러 )
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> 프레임의 컨텐츠 영역
				// 배경색상을 변경시킴
				getContentPane().setBackground(Color.red);
			}
		}); 

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> 프레임의 컨텐츠 영역
				// 배경색상을 변경시킴
				getContentPane().setBackground(Color.green);
			}
		});
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> 프레임의 컨텐츠 영역
				// 배경색상을 변경시킴
				getContentPane().setBackground(Color.blue);
			}
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> 프레임의 컨텐츠 영역
				// 배경색상을 변경시킴
				getContentPane().setBackground(Color.white);
			}
		});
		
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> 프레임의 컨텐츠 영역
				// 배경색상을 변경시킴
				getContentPane().setBackground(Color.yellow);
			}
		});
		
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> 프레임의 컨텐츠 영역
				// 배경색상을 변경시킴
				getContentPane().setBackground(Color.cyan);
			}
		});
	}
	
	public static void main(String[] args) {
		new ButtonEvent1();
	}
}












