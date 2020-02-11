package ch18_graphics;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{

	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g); // JFrame�� paint()�� �����
		
		// drawString("���ڿ�", x��ǥ, y��ǥ)
		g.drawString("hello java", 10, 60);
//		g.fillOval(100, 100, 50, 50);
//		g.fillRect(200, 200, 60, 60);
		g.drawOval(100, 100, 50, 50);
		g.drawRect(200, 200, 60, 60);
		System.out.println("paint ȣ��");
		
	}
	
	public static void main(String[] args) {
		new PaintExam();
	}
	
}
