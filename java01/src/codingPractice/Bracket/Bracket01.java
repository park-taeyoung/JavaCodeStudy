package codingPractice.Bracket;

class Solution01 {
	public String solution(String p) {
		if (p.isEmpty())
			return "";
		int count = 0;
		int i;
		String u = "";
		String v = "";
		// 나누기
		for (i = 0; i < p.length(); i++) {
			if (p.charAt(i) == ')')
				count--;
			else if (p.charAt(i) == '(')
				count++;

			if (count == 0)
				break;
		}
		u = p.substring(0, i + 1); // 균형잡힌 괄호 문자열
		v = p.substring(i + 1, p.length());

		boolean check = false;
		if (u.charAt(0) != '(')
			check = true;

		if (!check) {
			// 올바른 괄호 문자열
			StringBuilder sb = new StringBuilder(u);
			sb = sb.append(solution(v));
			return sb.toString();
		} else {
			// 올바른 괄호 문자열이 아닌 경우
			StringBuilder sb = new StringBuilder("");
			sb = sb.append("(");
			sb = sb.append(solution(v));
			sb = sb.append(")");
			StringBuilder sb1 = new StringBuilder(u);
			sb1.deleteCharAt(0); // 첫번째 문자 제거
			sb1.deleteCharAt(sb1.length() - 1);// 마지막 문자 제거
			for (int j = 0; j < sb1.length(); j++) {
				if (sb1.charAt(j) == ')')
					sb1.replace(j, j + 1, Character.toString('('));
				else
					sb1.replace(j, j + 1, Character.toString(')'));
			}
			sb = sb.append(sb1);
			return sb.toString();
		}
	}
}

public class Bracket01 {
	public static void main(String[] args) {
		String p = "(()())()";
		Solution01 func = new Solution01();
		String answer = func.solution(p);
		System.out.println(answer);
	}

}
