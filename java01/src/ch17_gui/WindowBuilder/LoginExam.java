package ch17_gui.WindowBuilder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginExam extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;
	
	// Map ���� �߰�
	private Map<String, String> map;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam frame = new LoginExam();
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
	public LoginExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userid = new JTextField();
		userid.setBounds(137, 27, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(137, 58, 116, 21);
		contentPane.add(pwd);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(46, 30, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(46, 61, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		// �ؽø� ����
		map = new HashMap<>();
		
		// ��.put(key, value) �ʿ� ���� �Է�
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ؽ�Ʈ�ʵ�.getText() �Է³��� �б�
				String id = userid.getText();
				
				// JPasswordField�� �Է°��� char[]�� ���ϵ�
				// String.valueOf(���ڹ迭) -> ��Ʈ������ ��ȯ
				String pw = String.copyValueOf(pwd.getPassword());
				
				// ��.get(key) -> value�� ���ϵ�
				String strId = map.get(id);
				if(strId != null && strId.equals(pw)) {
					// ���ڻ�(�����)
					lblResult.setForeground(Color.blue);
					lblResult.setText(id+"�� ȯ���մϴ�.");
				} else {
					lblResult.setForeground(Color.red);
					lblResult.setText("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
		});
		btnLogin.setBounds(137, 89, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("New label");
		lblResult.setBounds(32, 155, 342, 15);
		contentPane.add(lblResult);
	}
}