package ch15_exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWith {
	public static void main(String[] args) {
		// with란 말은 없지만 try(...) 괄호 안에 문장이 있는 형태를 try with 라고 한다.
		try (BufferedReader br = new BufferedReader( // 한글자씩이 아니라 한줄씩 읽어오는 것이 버퍼드 리더다.
				new InputStreamReader( // 인코딩
						new FileInputStream("D:\\DevProject\\JAVA\\test.txt")))) { // 파일 읽어오기
			while(true) {
				String str = br.readLine(); // 파일에서 한줄을 읽음
				if(str==null) break; // 더이상 내용이 없으면 종료
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace(); // 스택 정보를 화면에 출력
		}
//		try (InputStream inputstream = new FileInputStream("D:\\DevProject\\JAVA\\test.txt")) {
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
