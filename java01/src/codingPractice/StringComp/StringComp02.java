package codingPractice.StringComp;

class Solution02 {
    public int solution(String s) {
        int answer = 0;

        for(int i=1; i<=(s.length()/2)+1; i++){
            int result = getSplitedLength(s, i, 1).length();
            answer = i==1 ? result : (answer>result?result:answer);
        }
        System.out.println(answer);
        return answer;
    }

    public String getSplitedLength(String s, int n, int repeat){
        if(s.length() < n) return s;
        String result = "";
        String preString = s.substring(0, n);
        String postString = s.substring(n, s.length());

        // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
        if(!postString.startsWith(preString)){
            if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
            return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
        }

        return result += getSplitedLength(postString, n, repeat+1);
    }
}



public class StringComp02 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		Solution02 func = new Solution02();
		func.solution(s);

	}
}
