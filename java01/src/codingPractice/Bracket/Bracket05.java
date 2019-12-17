package codingPractice.Bracket;

class Solution05 {
	public String solution(String p) {
		String answer = "";
		StringBuffer ans = new StringBuffer();

		while (p.length() > 0) {
			int s = 0;
			int idx = 0;
			StringBuffer tmp = new StringBuffer();
			do {
				if (p.charAt(idx) == '(')
					s++;
				else
					s--;

				idx++;
			} while (s != 0);

			if (p.charAt(0) == ')') {
				ans.append("(");
				if (p.length() != idx)
					ans.append(solution(p.substring(idx)));
				ans.append(")");
				for (int i = 1; i < idx - 1; i++) {
					if (p.charAt(i) == '(')
						tmp.append(")");
					else
						tmp.append("(");
				}
				p = tmp.toString();

			} else {
				ans.append(p.substring(0, idx));
				p = p.substring(idx);
			}

		}

		answer = ans.toString();
		return answer;
	}
}

public class Bracket05 {
	public static void main(String[] args) {
		String p = "(()())()";
		Solution05 func = new Solution05();
		String answer = func.solution(p);
		System.out.println(answer);
	}
}
