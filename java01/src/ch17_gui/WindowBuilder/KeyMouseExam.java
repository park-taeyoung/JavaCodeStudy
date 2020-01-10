package ch17_gui.WindowBuilder;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
// ���콺 �̺�Ʈ ó�� MouseListener -> MouseEvent
public class KeyMouseExam extends JApplet
							implements MouseListener, KeyListener, MouseMotionListener{
	private int x, y;
	private int width, height;
	private Image img;
	
	// ȭ�� �׸��� �� �ʱ�ȭ �����ִ� �޼ҵ�
	@Override
	public void init() {
		// ȭ�� ������
		setSize(300, 300);
		
		// �̹��� �ε�
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("will.png"));
		
		// ���콺 �̺�Ʈ ����
		addMouseListener(this);
		
		// Ű�̺�Ʈ ����
		addKeyListener(this);
		
		// ���콺 �����̺�Ʈ ����
		addMouseMotionListener(this);
		
		// Ű �Է��� ���� �� �ֵ��� ����
		setFocusable(true);
		
		// ���� ȭ�鿡 �Է���Ŀ�� ����
		requestFocus();
	}
	
	// ȭ�� ��� �޼ҵ�
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// �̹����� ȭ�鿡 ���
		g.drawImage(img, x, y, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// �̹����� ����, ���� ������ ���
		width = img.getWidth(null);
		height = img.getHeight(null);
		
		// Ŭ���� x, y ��ǥ ����
		x=e.getX() - (width/2);
		y=e.getY() - (height/2);;
		
		// �׷��� ���� ��û -> paint() �� ȣ���
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
// ---------------------------------------------------------------------------------
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println(e);
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN:
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT:
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(300-width, x+5); break;
		}
		
		// �׷��� ���� ��û
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

// ---------------------------------------------------------------------------------

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag... x : "+e.getX()+",y : "+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse drag... x : "+e.getX()+",y : "+e.getY());
	}
}