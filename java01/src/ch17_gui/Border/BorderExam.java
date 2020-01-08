package ch17_gui.Border;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderExam extends JFrame{
	// 생성자
	public BorderExam() {
		this.setTitle("프레임에 버튼 추가");
		
		// 버튼 객체 생성
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		
		// 프레임에 버튼을 추가
		// add( 배치할컨트롤, 위치 ), 위치를 생략하면 Center로 배치
		// this.add(button1, "Center");
		// this.add(button1, BorderLayout.CENTOR);
		
		this.add(button1);
		this.add(button2, "North");
		this.add(button3, "South");
		this.add(button4, "East");
//		this.add(button5, "West");
//		this.add(button6, "West");
		
		JPanel p = new JPanel();
		p.add(button5);
		p.add(button6);
		
		this.add(p, "West");
		
		// 프레임의 크기 설정
		this.setSize(300, 200);
		
		// 프레임을 화면에 표시
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderExam();
	}

}
