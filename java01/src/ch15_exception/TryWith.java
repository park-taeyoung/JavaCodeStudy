package ch15_exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWith {
	public static void main(String[] args) {
		// with�� ���� ������ try(...) ��ȣ �ȿ� ������ �ִ� ���¸� try with ��� �Ѵ�.
		try (BufferedReader br = new BufferedReader( // �ѱ��ھ��� �ƴ϶� ���پ� �о���� ���� ���۵� ������.
				new InputStreamReader( // ���ڵ�
						new FileInputStream("D:\\DevProject\\JAVA\\test.txt")))) { // ���� �о����
			while(true) {
				String str = br.readLine(); // ���Ͽ��� ������ ����
				if(str==null) break; // ���̻� ������ ������ ����
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace(); // ���� ������ ȭ�鿡 ���
		}
//		try (InputStream inputstream = new FileInputStream("D:\\DevProject\\JAVA\\test.txt")) {
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
