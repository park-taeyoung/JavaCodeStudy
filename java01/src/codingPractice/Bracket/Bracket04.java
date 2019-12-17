package codingPractice.Bracket;

import java.util.Stack;

class Solution04 {
	public String solution(String p) {
		String answer = "";

		if (p.isEmpty())
			return "";

		String u = "";
		String v = "";
		int left = 0;
		int right = 0;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				left++;
			} else {
				right++;
			}

			if (left == right) {
				u = p.substring(0, i + 1);
				v = p.substring(i + 1, p.length());
				break;
			}
		}

		Stack<Character> stk = new Stack<>();
		boolean right_paren = true;

		try {
			for (int i = 0; i < u.length(); i++) {
				if (u.charAt(i) == '(')
					stk.push('(');
				else
					stk.pop();
			}
		} catch (Exception e) {
			right_paren = false;
		}

		// right parentheses
		if (stk.isEmpty() && right_paren) {
			answer = u + solution(v);
		} else {
			answer += '(';
			answer += solution(v) + ')';

			for (int i = 1; i < u.length() - 1; i++) {
				if (u.charAt(i) == '(')
					answer += ')';
				else
					answer += '(';
			}
		}
		return answer;
	}
}

public class Bracket04 {
	public static void main(String[] args) {
		String p = "(()())()";
		Solution04 func = new Solution04();
		String answer = func.solution(p);
		System.out.println(answer);
	}
}
