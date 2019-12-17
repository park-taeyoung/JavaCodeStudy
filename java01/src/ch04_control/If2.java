package ch04_control;

public class If2 {
// 명령행 매개변수 (Command Line Arguments)
	public static void main(String[] args) {
// Integer.parseInt(스트링) => 숫자로		
		
//		for(int i = 0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		int num = Integer.parseInt(args[0]);
		if (num % 2 == 0) {
			System.out.println(num + ": 짝수 입니다.");
		} else {
			System.out.println(num + ": 홀수 입니다.");
		}
	}
}
