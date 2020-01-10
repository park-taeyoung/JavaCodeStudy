package ch17_gui.WindowBuilder;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardExam extends JFrame {
	CardLayout card; // ī�� ���̾ƿ� ��ü
	Container con; // �������� ������ ����

	public CardExam() {
		con = getContentPane(); // �������� ������ ������ ������
		card = new CardLayout();
		setLayout(card); // �⺻ ���̾ƿ��� ī�� ���̾ƿ����� ����
		// JPanel ��ü �迭
		JPanel[] pan = new JPanel[5];
		Color[] color = { Color.red, Color.yellow, Color.green, Color.blue, Color.cyan };
		for (int i = 0; i < pan.length; i++) {
			pan[i] = new JPanel(); // �г� ����
			pan[i].setBackground(color[i]); // �г��� ����
			add("card" + i, pan[i]); // �����ӿ� �г� �߰�
			pan[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					card.next(con); // ���� ȭ������ �̵�
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
