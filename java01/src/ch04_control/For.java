package ch04_control;

public class For {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		
		// Integer.parseInt(���ڿ�) ���ڿ��� ���ڷ� ��ȯ
		System.out.println(args);
		if( args.length == 0) {
			System.out.println("����� �Ű������� �Է��ϼ���");
			System.exit(0); // ���α׷� ���� ����
		}
		int num = Integer.parseInt(args[0]);
		for(int i=1; i<num; i++) {
			
		}
		
	}
}
