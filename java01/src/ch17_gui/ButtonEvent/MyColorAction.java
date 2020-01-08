package ch17_gui.ButtonEvent;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private Color c; // ���� ����
	private Container con; // �����̳� ����
	
	// ������
	public MyColorAction(JFrame f, Color c) {
		con = f.getContentPane(); // �������� ������ ����
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c); // ������ ����
	}
}
