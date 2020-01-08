package ch17_gui.Panel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	public PanelExam() {
		JPanel p = new JPanel(); // �г� ����
		p.setBackground(Color.yellow); // �г��� ������ ����
		JButton button1 = new JButton("��ư1"); // ��ư ����
		JButton button2 = new JButton("��ư2");
		JButton button3 = new JButton("��ư3");
		p.add(button1); // �гο� ��ư�� ����
		p.add(button2);
		p.add(button3);
		this.add(p); // �����ӿ� �г��� ����
		this.setSize(300, 300); // �������� ������ ����
		this.setVisible(true); // �������� ȭ�鿡 ǥ��
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �ݱ� ����
	}
	
	public static void main(String[] args) {
		new PanelExam();
	}
}
