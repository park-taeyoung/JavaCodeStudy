package ch15_exception;
//# 예외 처리 방법
//try  catch 직접처리
//throws 예외처리 클래스에 처리 위임
//메소드 이름 throws 예외처리 클래스1, 예외처리 클래스 2
//main method 내부의 코드를 실행하다가 예외가 발생하면
//직접 처리하지 않고  throws 뒤에 지정한 예외처리 클래스에 처리를 위임

public class ThrowsExam {
	public static void main(String[] args)
			throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000); // Thread 프로그램안에서 실행되는 작업단위. 1초 멈춤
		}
	}
}
