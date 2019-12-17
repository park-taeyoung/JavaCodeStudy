package codingPractice.StringComp;

class Solution05 {
	public int solution(String s) {
		int answer = Integer.MAX_VALUE;
		int i, j;
		if (s.length() <= 1) {
			return s.length();
		}
		for (i = 1; i <= s.length() / 2; i++) {
			int value = 0;
			String temp = s.substring(0, i);
			String temp2 = "";
			int count = 1;
			for (j = i; j < s.length(); j += i) {
				if (j + i >= s.length()) {
					temp2 = s.substring(j, s.length());
				} else {
					temp2 = s.substring(j, j + i);
				}
				if (temp.equals(temp2)) {
					count++;
				} else {
					if (count == 1) {
						value += temp.length();
					} else {
						value += (temp.length() + String.valueOf(count).length());
					}
					temp = temp2;
					count = 1;
				}
			}
			if (count != 1) {
				value += (temp.length() + String.valueOf(count).length());
			} else {
				value += (temp.length());
			}
			answer = Math.min(answer, value);
		}
		System.out.println(answer);
		return answer;
	}
}

public class StringComp05 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		Solution05 func = new Solution05();
		func.solution(s);

	}
}
