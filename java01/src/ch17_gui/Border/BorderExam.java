package ch17_gui.Border;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderExam extends JFrame{
	// ������
	public BorderExam() {
		this.setTitle("�����ӿ� ��ư �߰�");
		
		// ��ư ��ü ����
		JButton button1 = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		JButton button3 = new JButton("��ư3");
		JButton button4 = new JButton("��ư4");
		JButton button5 = new JButton("��ư5");
		JButton button6 = new JButton("��ư6");
		
		// �����ӿ� ��ư�� �߰�
		// add( ��ġ����Ʈ��, ��ġ ), ��ġ�� �����ϸ� Center�� ��ġ
		// this.add(button1, "Center");
		// this.add(button1, BorderLayout.CENTOR);
		
		this.add(button1);
		this.add(button2, "North");
		this.add(button3, "South");
		this.add(button4, "East");
//		this.add(button5, "West");
//		this.add(button6, "West");
		
		JPanel p = new JPanel();
		p.add(button5);
		p.add(button6);
		
		this.add(p, "West");
		
		// �������� ũ�� ����
		this.setSize(300, 200);
		
		// �������� ȭ�鿡 ǥ��
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderExam();
	}

}
