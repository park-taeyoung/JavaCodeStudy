package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TabExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabExam frame = new TabExam();
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
	public TabExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("\uD0ED1", new ImageIcon("C:\\Users\\PARK_TAEYOUNG\\Desktop\\tab.PNG"), panel, null);
		
		JButton btnNewButton = new JButton("\uBC84\uD2BC1");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\PARK_TAEYOUNG\\Desktop\\button.PNG"));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\uD0ED2", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("\uD0ED3", new ImageIcon("C:\\Users\\PARK_TAEYOUNG\\Desktop\\tab.PNG"), panel_2, null);
		
		JButton btnNewButton_1 = new JButton("\uBC84\uD2BC2");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\PARK_TAEYOUNG\\Desktop\\button.PNG"));
		panel_2.add(btnNewButton_1);
	}

}
