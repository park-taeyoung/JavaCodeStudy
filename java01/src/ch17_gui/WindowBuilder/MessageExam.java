package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MessageExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageExam frame = new MessageExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MessageExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button1 = new JButton("Message");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ܼ��ϰ� �ȳ����� ����ϴ� ��ȭ ����
				// showMessageDialog(�θ�������Ʈ, �޽���)
				JOptionPane.showMessageDialog(MessageExam.this, "Message");
			}
		});
		contentPane.add(button1);
		
		JButton button2 = new JButton("Confirm");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// showConfirmDialog(�θ�������Ʈ, "�޽���")
				// ��, �ƴϿ�, ��� ��ư �߿��� ����
				int result = JOptionPane.showConfirmDialog(MessageExam.this, "�����ұ��?");
				// int result = JOptionPane.showConfirmDialog(MessageExam.this, "�����ұ��?", null, JOptionPane.YES_NO_OPTION);
				
				// yes Ŭ����
				if(result==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(MessageExam.this, "���α׷��� �����մϴ�.");
					System.exit(0);
				}
			}
		});
		contentPane.add(button2);
		
		JButton button3 = new JButton("Input");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���̾�α׿��� �Է¹��� ���� ������ ����
				String name = JOptionPane.showInputDialog(MessageExam.this, "�̸��� �Է��ϼ���");
				JOptionPane.showMessageDialog(MessageExam.this, name+"�� ȯ���մϴ�.");
			}
		});
		contentPane.add(button3);
		
		JButton button4 = new JButton("Option");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str = {"�߰�", "����", "����"};
				
				// showOptionDialog(�θ�������Ʈ, �޽���, ����, ��ư����, �޽�������, ������, ��ưŸ��Ʋ, �ʱⰪ
				JOptionPane.showOptionDialog(MessageExam.this, "�����ϼ���.", "�۾�����"
						, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			}
		});
		contentPane.add(button4);
	}
}








