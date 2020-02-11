package ch18_graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FrameColor extends JFrame{
	
	public FrameColor() throws InterruptedException {
		setVisible(true); // �������� ȭ�鿡 ǥ��
		Container c = getContentPane(); // �������� ������ ����
		for(int i=0; i<=255; i++) {
			setSize(i*2, i); // �������� ũ�� ����
			setLocation(i*2,  i); // �������� ��µ� ��ǥ ����
			c.setBackground(new Color(i,0,0)); // ������ ����
			Thread.sleep(10);
		}
		
		for(int i=0; i<=255; i++) {
			setSize(i*2, i); // �������� ũ�� ����
			setLocation(i*2,  i); // �������� ��µ� ��ǥ ����
			c.setBackground(new Color(255,i,0)); // ������ ����
			Thread.sleep(10);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		System.out.println("����Ʈ �޼��� ȣ��...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();
	}
}
