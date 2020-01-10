package ch17_gui.WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableExam extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableExam frame = new TableExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TableExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
//--------------------------------------------------------------------
		String[] title = {"π¯»£", "¿Ã∏ß", "¿‘ªÁ¿œ"};
		String[][] data = {
				{"1", "±Ë√∂ºˆ", "2010-03-10"},
				{"2", "±Ë√∂»£", "2011-10-17"},
				{"3", "π⁄πŒ∞Ê", "2012-05-20"}
		};
		
		// new JTable(µ•¿Ã≈Õ«‡, ¡¶∏Ò«‡);
		table = new JTable(data, title);
		table.getColumnModel().getColumn(2).setPreferredWidth(191);
		scrollPane.setViewportView(table);
//--------------------------------------------------------------------
	}
}
