package ch17_gui.WindowBuilder;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalSliderUI;

public class SliderExam extends JFrame {
// -------------------------------------------------------------------------------------
	private JPanel contentPane;
	private int red, green, blue;
	private JSlider sliderR;
	private JSlider sliderG;
	private JSlider sliderB;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderExam frame = new SliderExam();
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
	public SliderExam() {
		panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

// -------------------------------------------------------------------------------------
		sliderR = new JSlider();
		sliderR.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// �����̴��� ���� ����
				red = sliderR.getValue();

				// �г��� ������ ����
				panel.setBackground(new Color(red, green, blue));
			}
		});

		// �����̴��� ���콺 Ŭ�� �̵� ��� �߰�
		sliderR.setUI(new MetalSliderUI() {
			protected void scrollDueToClickInTrack(int direction) {
				// ���콺 Ŭ���� ��ġ�� �����̴���
				red = valueForXPosition(sliderR.getMousePosition().x);

				// �����̴��� �� ����
				sliderR.setValue(red);

				// �г��� ������ ����
				panel.setBackground(new Color(red, green, blue));
			}
		});

		sliderR.setPaintLabels(true);
		sliderR.setPaintTicks(true);
		sliderR.setMajorTickSpacing(40);
		sliderR.setMinorTickSpacing(10);
		sliderR.setValue(0);
		sliderR.setMaximum(255);
		sliderR.setBounds(92, 24, 200, 37);
		contentPane.add(sliderR);
// -------------------------------------------------------------------------------------
		
// -------------------------------------------------------------------------------------
		sliderG = new JSlider();
		sliderG.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// �����̴��� ���� ����
				green = sliderG.getValue();

				// �г��� ������ ����
				panel.setBackground(new Color(red, green, blue));
			}
		});

		// �����̴��� ���콺 Ŭ�� �̵� ��� �߰�
		sliderG.setUI(new MetalSliderUI() {
			protected void scrollDueToClickInTrack(int direction) {
				// ���콺 Ŭ���� ��ġ�� �����̴���
				green = valueForXPosition(sliderG.getMousePosition().x);

				// �����̴��� �� ����
				sliderG.setValue(green);

				// �г��� ������ ����
				panel.setBackground(new Color(red, green, blue));
			}
		});

		sliderG.setPaintLabels(true);
		sliderG.setPaintTicks(true);
		sliderG.setMajorTickSpacing(40);
		sliderG.setMinorTickSpacing(10);
		sliderG.setValue(0);
		sliderG.setMaximum(255);
		sliderG.setBounds(92, 70, 200, 37);
		contentPane.add(sliderG);

// -------------------------------------------------------------------------------------
		
// -------------------------------------------------------------------------------------		
		sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// �����̴��� ���� ����
				blue = sliderB.getValue();

				// �г��� ������ ����
				panel.setBackground(new Color(red, green, blue));
			}
		});
		
		// �����̴��� ���콺 Ŭ�� �̵� ��� �߰�
		sliderB.setUI(new MetalSliderUI() {
			protected void scrollDueToClickInTrack(int direction) {
				// ���콺 Ŭ���� ��ġ�� �����̴���
				blue = valueForXPosition(sliderB.getMousePosition().x);

				// �����̴��� �� ����
				sliderB.setValue(blue);

				// �г��� ������ ����
				panel.setBackground(new Color(red, green, blue));
			}
		});
		
		sliderB.setMinorTickSpacing(10);
		sliderB.setMajorTickSpacing(40);
		sliderB.setPaintLabels(true);
		sliderB.setPaintTicks(true);
		sliderB.setValue(0);
		sliderB.setMaximum(255);
		sliderB.setBounds(92, 117, 200, 37);
		contentPane.add(sliderB);

// -------------------------------------------------------------------------------------		
		
		panel.setBounds(12, 167, 293, 247);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Red");
		lblNewLabel.setBounds(12, 24, 57, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Green");
		lblNewLabel_1.setBounds(12, 70, 57, 15);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Blue");
		lblNewLabel_2.setBounds(12, 117, 57, 15);
		contentPane.add(lblNewLabel_2);
	}
}