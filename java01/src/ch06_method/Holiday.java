package ch06_method;
import java.util.Scanner;
public class Holiday {
	// �ټӿ�����
	// 1-5 �� 10��
	// 6-10�� 15��
	// 11�� �̻� 20��
	
	// ���� ����
	static int y;
	
	// �Է�method
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ټӿ���");
		y = scan.nextInt();
		scan.close();
	}
	
	// ��� method
	static int holiday(int year) {
		int day = 0;
		if(year <= 5) {
			day = 10;
		}else if(year <= 10) {
			day = 15;
		}else {
			day = 20;
		}
		return day;
	}

	public static void main(String[] args) {
		input();
		System.out.println("�ް��ϼ�" + holiday(y));
	}


}
