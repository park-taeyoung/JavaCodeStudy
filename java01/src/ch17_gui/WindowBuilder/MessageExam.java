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
				// 단순하게 안내문만 출력하는 대화 상자
				// showMessageDialog(부모컴포넌트, 메시지)
				JOptionPane.showMessageDialog(MessageExam.this, "Message");
			}
		});
		contentPane.add(button1);
		
		JButton button2 = new JButton("Confirm");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// showConfirmDialog(부모컴포넌트, "메시지")
				// 예, 아니요, 취소 버튼 중에서 선택
				int result = JOptionPane.showConfirmDialog(MessageExam.this, "종료할까요?");
				// int result = JOptionPane.showConfirmDialog(MessageExam.this, "종료할까요?", null, JOptionPane.YES_NO_OPTION);
				
				// yes 클릭시
				if(result==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(MessageExam.this, "프로그램을 종료합니다.");
					System.exit(0);
				}
			}
		});
		contentPane.add(button2);
		
		JButton button3 = new JButton("Input");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 다이얼로그에서 입력받은 값을 변수에 저장
				String name = JOptionPane.showInputDialog(MessageExam.this, "이름을 입력하세요");
				JOptionPane.showMessageDialog(MessageExam.this, name+"님 환영합니다.");
			}
		});
		contentPane.add(button3);
		
		JButton button4 = new JButton("Option");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str = {"추가", "수정", "삭제"};
				
				// showOptionDialog(부모컴포넌트, 메시지, 제목, 버튼유형, 메시지종료, 아이콘, 버튼타이틀, 초기값
				JOptionPane.showOptionDialog(MessageExam.this, "선택하세요.", "작업선택"
						, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			}
		});
		contentPane.add(button4);
	}
}









