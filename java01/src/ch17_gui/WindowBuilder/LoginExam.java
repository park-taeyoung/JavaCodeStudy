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
	
	// Map 변수 추가
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
		
		// 해시맵 생성
		map = new HashMap<>();
		
		// 맵.put(key, value) 맵에 값을 입력
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트필드.getText() 입력내용 읽기
				String id = userid.getText();
				
				// JPasswordField의 입력값은 char[]로 리턴됨
				// String.valueOf(문자배열) -> 스트링으로 변환
				String pw = String.copyValueOf(pwd.getPassword());
				
				// 맵.get(key) -> value가 리턴됨
				String strId = map.get(id);
				if(strId != null && strId.equals(pw)) {
					// 글자색(전경색)
					lblResult.setForeground(Color.blue);
					lblResult.setText(id+"님 환영합니다.");
				} else {
					lblResult.setForeground(Color.red);
					lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
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
