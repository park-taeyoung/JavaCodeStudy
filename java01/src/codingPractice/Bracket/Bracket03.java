package codingPractice.Bracket;

class Solution03 {
	private boolean checkCorrectness(String s) {
		int openBrackets = 0;
		for (int i = 0; i < s.length(); i++) {
			openBrackets += (s.charAt(i) == '(') ? 1 : -1;
			if (openBrackets < 0)
				return false;
		}
		return true;
	}

	private String flipBrackets(String s) {
		String w = "";
		for (int i = 0; i < s.length(); i++) {
			w += (s.charAt(i) == '(') ? ")" : "(";
		}
		return w;
	}

	private String createCorrectBrackets(String w) {
		if (w.equals("")) {
			return "";
		}

		int countOpenBracket = 0;
		int idx = 0;

		while (!(idx > 0 && countOpenBracket == 0)) {
			if (w.charAt(idx) == '(')
				countOpenBracket++;
			else
				countOpenBracket--;
			idx++;
		}
		String u = w.substring(0, idx);
		String v = w.substring(idx);

		if (checkCorrectness(u))
			return u + createCorrectBrackets(v);
		return "(" + createCorrectBrackets(v) + ")" + flipBrackets(u.substring(1, u.length() - 1));
	}

	public String solution(String p) {
		String answer = createCorrectBrackets(p);
		return answer;
	}
}

public class Bracket03 {
	public static void main(String[] args) {
		String p = "(()())()";
		Solution03 func = new Solution03();
		String answer = func.solution(p);
		System.out.println(answer);
	}
}
