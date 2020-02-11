package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ColorDialogExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorDialogExam frame = new ColorDialogExam();
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
	public ColorDialogExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("�޴�");
		menuBar.add(mnNewMenu);
		
		JMenuItem miColor = new JMenuItem("����");
		miColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���� ���̾�α׿��� ������ ���� �����
				Color color = JColorChooser.showDialog(ColorDialogExam.this, "������ �����ϼ���.", Color.blue);
				
				// ��� ���� ����
				contentPane.setBackground(color);
				
				
			}
		});
		mnNewMenu.add(miColor);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
