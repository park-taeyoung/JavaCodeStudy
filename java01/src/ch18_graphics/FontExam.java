package ch18_graphics;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font; // �۲� ���� ��ü
	private FontMetrics fm; // ��Ʈ ���� ���� ���� ��ü
	private int x=100, y=100;
	private String message;
	private Dimension dim; // ȭ�� ����, ���� ����� �����ϴ� ��ü
	
	// ȭ�� ��� ���� �� �ʱ�ȭ �۾���
	@Override
	public void init() {
		message = "�׷��� �׽�Ʈ";
		// ��Ʈ ���� new Font("��Ʈ�̸�", �ɼ�, ������)
		font = new Font("����", Font.BOLD, 30);
		setSize(250, 250); // ȭ�� ������ ����
		
		fm = getFontMetrics(font);
		dim = getSize(); // ���� ȭ���� ������
		System.out.println(x+","+y);
		x = (dim.width/2) - (fm.stringWidth(message)/2);
		// getDescent() ���ڿ��� ���� ����
		y = (dim.height/2) - (fm.getDescent()/2);
		
		
	}
	
	
	// ȭ�� ��� ó�� �ڵ�
	@Override
	public void paint(Graphics g) {
		// �׷��� ȭ�鿡 ����� ��Ʈ ����
		g.setFont(font);;
		// �׷��� ȭ�鿡 ���ڿ� ���
		g.drawString(message,  x,  y);
	}
	
}
