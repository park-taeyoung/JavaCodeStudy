package ch17_gui.WindowBuilder;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardExam extends JFrame {
	CardLayout card; // 카드 레이아웃 객체
	Container con; // 프레임의 컨텐츠 영역

	public CardExam() {
		con = getContentPane(); // 프레임의 컨텐츠 영역을 가져옴
		card = new CardLayout();
		setLayout(card); // 기본 레이아웃을 카드 레이아웃으로 변경
		// JPanel 객체 배열
		JPanel[] pan = new JPanel[5];
		Color[] color = { Color.red, Color.yellow, Color.green, Color.blue, Color.cyan };
		for (int i = 0; i < pan.length; i++) {
			pan[i] = new JPanel(); // 패널 생성
			pan[i].setBackground(color[i]); // 패널의 배경색
			add("card" + i, pan[i]); // 프레임에 패널 추가
			pan[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					card.next(con); // 다음 화면으로 이동
				}
			});
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) {
		new CardExam();
	}
}
