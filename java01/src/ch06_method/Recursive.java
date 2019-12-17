package ch06_method;

public class Recursive {
	// ���ȣ��
	static long fact1(int n) {
		// ���ǽ� ? true �϶��� �� : false �϶��� ��
		// 5 x fact1(4)
		//     4 x fact1(3)
		//         3 x fact1(2)
		//             2 x fact1(1)
		//                 1
		return n==1 ? 1 : n * fact1(n-1);
	}
	public static void main(String[] args) {
		// �����, �ߴ���(Break Point)
		// F5 step into
		// F6 step over
		System.out.println(fact1(5));
	}
}
