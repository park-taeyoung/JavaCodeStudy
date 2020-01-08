package ch17_gui.Grid;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam extends JFrame{
	public GridExam() {
		//this.setLayout(new GridLayout(2, 3)); // 2�� 3���� �׸��� ���̾ƿ�
		this.setLayout(new FlowLayout());
		for (int i=1; i<=6; i++) {
			JButton button = new JButton("��ư" + i);
			this.add(button); // �����ӿ� ��ư�� ����
		}
		
		// ������ ����
		this.setSize(300, 300); // ������ ������ ����
		this.setVisible(true); // ������ ȭ�鿡 ǥ��
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ����
	}
	
	public static void main(String[] args) {
		new GridExam();
	}
}
