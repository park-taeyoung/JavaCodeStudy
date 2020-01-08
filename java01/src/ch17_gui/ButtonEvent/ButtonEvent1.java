package ch17_gui.ButtonEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent1 extends JFrame{

	private JButton button1,button2,button3,button4,button5,button6; 
	
	public ButtonEvent1() {
		// JFrame�� �⺻���̾ƿ��� BorderLayout���� �̰� ������� �ʰ�
		// �÷ο� ���̾ƿ����� ����
		this.setLayout(new FlowLayout());
		
		// ��ư ��ü ����
		button1 = new JButton("Red");
		button2 = new JButton("Grren");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		
		// �������� ��ư�� ����
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		
		// ������ ����
		this.setSize(450, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// ��ư�� �̺�Ʈ ��� �߰�
		// �̺�Ʈ�ҽ�.�̺�Ʈ������( �̺�Ʈ�ڵ鷯 )
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> �������� ������ ����
				// �������� �����Ŵ
				getContentPane().setBackground(Color.red);
			}
		}); 

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> �������� ������ ����
				// �������� �����Ŵ
				getContentPane().setBackground(Color.green);
			}
		});
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> �������� ������ ����
				// �������� �����Ŵ
				getContentPane().setBackground(Color.blue);
			}
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> �������� ������ ����
				// �������� �����Ŵ
				getContentPane().setBackground(Color.white);
			}
		});
		
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> �������� ������ ����
				// �������� �����Ŵ
				getContentPane().setBackground(Color.yellow);
			}
		});
		
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane() -> �������� ������ ����
				// �������� �����Ŵ
				getContentPane().setBackground(Color.cyan);
			}
		});
	}
	
	public static void main(String[] args) {
		new ButtonEvent1();
	}
}












