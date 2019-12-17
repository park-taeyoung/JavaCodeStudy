package ch04_control;

public class For {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		
		// Integer.parseInt(문자열) 문자열을 숫자로 변환
		System.out.println(args);
		if( args.length == 0) {
			System.out.println("명령행 매개변수를 입력하세요");
			System.exit(0); // 프로그램 강제 종료
		}
		int num = Integer.parseInt(args[0]);
		for(int i=1; i<num; i++) {
			
		}
		
	}
}
