package ch17_gui.Grid;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam extends JFrame{
	public GridExam() {
		//this.setLayout(new GridLayout(2, 3)); // 2행 3열의 그리드 레이아웃
		this.setLayout(new FlowLayout());
		for (int i=1; i<=6; i++) {
			JButton button = new JButton("버튼" + i);
			this.add(button); // 프레임에 버튼을 붙임
		}
		
		// 프레임 설정
		this.setSize(300, 300); // 프레임 사이즈 설정
		this.setVisible(true); // 프레임 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 설정
	}
	
	public static void main(String[] args) {
		new GridExam();
	}
}
