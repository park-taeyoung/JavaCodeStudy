package ch15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 2�� �̻��� ���ܰ� �Բ� �߻��ϴ� ���
public class DoubleExam {
	public static void main(String[] args) {
		int num = 50;
		Scanner sc = null;
		
		try {
			System.out.println("���ڸ� �Է��ϼ���.");
			sc = new Scanner(System.in);
			int value = sc.nextInt();
			System.out.println(num/value);
		} catch (ArithmeticException ae) { // ��� ���� ���� ����ó��
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (InputMismatchException ie) { // �߸��� �Էµ����� ����ó��
			System.out.println("���ڸ� �Է� �����մϴ�.");
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
		} finally { //���� �߻� ���� ���� ���� �׻� ����Ǵ� �ڵ�
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
	}
}
