package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckboxExam2 extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxExam frame = new CheckboxExam();
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
	public CheckboxExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JCheckBox ckJava = new JCheckBox("�ڹ�");
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckC = new JCheckBox("C���");
		ckC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckC);
		
		JCheckBox ckIot = new JCheckBox("�繰���ͳ�");
		ckIot.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckIot);
		
		JCheckBox ckDB = new JCheckBox("�����ͺ��̽�");
		ckDB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckDB);
		
		JButton btnExit = new JButton("����");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}
	
	void putResult(ItemEvent e) {
		JCheckBox ck = (JCheckBox)e.getSource();
		if(e.getStateChange()==ItemEvent.SELECTED) { // ItemEvent.SELECTED üũ���� 
			ta.append(ck.getText() + "�� ��û�߽��ϴ�.\n"); // JtextArea.append() �ؽ�Ʈ�� �߰�
		} else if (e.getStateChange()==ItemEvent.DESELECTED) { // ItemEvent.DESELECTED üũ��������
			ta.append(ck.getText() + "�� ����߽��ϴ�.\n");
		}
	}
}