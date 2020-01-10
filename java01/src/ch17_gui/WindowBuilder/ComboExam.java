package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ComboExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboExam frame = new ComboExam();
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
	public ComboExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JComboBox cboDan = new JComboBox();
		cboDan.addItemListener(new ItemListener() {
			// �޺��ڽ��� ������ �����ϸ� �ڵ����� ȣ��� 
			public void itemStateChanged(ItemEvent e) {
				// System.out.println(e.getStateChange());
				if(e.getStateChange()==ItemEvent.SELECTED) {
					// �޺��ڽ����� ������ ����
					// System.out.println(cboDan.getSelectedItem());
					// �޺��ڽ����� ������ ���� �ε���
					// System.out.println(cboDan.getSelectedIndex());
					int dan = Integer.parseInt((String)cboDan.getSelectedItem());
					ta.setText("");
					for(int i=1; i<=9; i++) {
						ta.append(String.format("%d x %d x %2d\n", dan, i, dan*i));
					}
				}
			}
		});
		cboDan.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
		contentPane.add(cboDan, BorderLayout.NORTH);
		ta = new JTextArea();
		contentPane.add(ta, BorderLayout.CENTER);
	}
}