package ch13_useful;

import java.util.Calendar;

public class Cal2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //Ķ���� ��ü ����
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //���° ��
		// ���� (1 �Ͽ��� ~ 7 �����)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: yoil = "�Ͽ���"; break;
		case 2: yoil = "������"; break;
		case 3: yoil = "ȭ����"; break;
		case 4: yoil = "������"; break;
		case 5: yoil = "�����"; break;
		case 6: yoil = "�ݿ���"; break;
		case 7: yoil = "�����"; break;
		}
		System.out.println("������ "+yoil+"�Դϴ�.");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//���° ��
	}
}