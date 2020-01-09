package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClockExam extends JFrame implements Runnable{

	private JPanel contentPane;
	
	private Calendar cal;
	private String str;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockExam frame = new ClockExam();
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
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnClose = new JButton("���α׷� ����");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnClose, BorderLayout.NORTH);
		
		lblTime = new JLabel("New label");
		lblTime.setFont(new Font("����", Font.PLAIN, 20));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTime, BorderLayout.CENTER);
		
		// �ڵ� �߰�
		Thread t = new Thread(this);
		t.start(); // run method�� �����
		
	}
	
	@Override
	public void run() {
		// �ڵ� �߰�
		while(true) { // ���ѹݺ�
			
			// Ķ���� �ν��Ͻ� ���� (����ð� ������ cal ������ ����)
			cal = Calendar.getInstance();
			
			// 02d ���� 2�ڸ�, ���ڸ��� 0���� ä��
			str = String.format("%02d:%02d:%02d",
					cal.get(Calendar.HOUR_OF_DAY),
					cal.get(Calendar.MINUTE),
					cal.get(Calendar.SECOND));
			
			// ���̺� �ð� ��� Text(���ڿ�)
			lblTime.setText(str);
			
			// ���̺� �ð� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
