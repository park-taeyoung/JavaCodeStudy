package codingPractice.StringComp;


class Solution04 {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = s.length() / 2; i >= 0; i--) {
            answer = Math.min(answer, count(s, i));
        }
        System.out.println(answer);
        return answer;
    }

    private int count(String s, int k) {
        if (k == 0) {
            return s.length();
        }
        int N = s.length();
        String prev = s.substring(0, k);
        int count = 1;
        int i = k;

        StringBuilder sb = new StringBuilder();

        while (i < N) {
            String cur = s.substring(i, Math.min(s.length(), i + k));
            if (prev.equals(cur)) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(prev);
                prev = cur;
                count = 1;
            }
            i = i + k;
        }

        if (count > 1) {
            sb.append(count);
        }
        sb.append(prev);

        return sb.length();
    }
}

public class StringComp04 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		Solution04 func = new Solution04();
		func.solution(s);

	}
}
