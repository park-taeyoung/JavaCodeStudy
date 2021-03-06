package codingPractice.StringComp;

import java.util.HashMap;
import java.util.Iterator;

class Solution01 {
    public int solution(String s) {
      int min = s.length();
		HashMap<String, Integer> map = new HashMap<>(); 
		StringBuilder sb = null;
		for(int i = 1; i <= (s.length() /2) ; i++) {
			//윈도우의 크기
			sb = new StringBuilder(""); //압축되어 생성되는 문자열
			int j;
			for(j = 0; j < s.length() ; j+=i) {
				//윈도우의 크기 만큼 증가
                if(j+i > s.length()) //범위를 벗어날 경우
					break;
				String sub = s.substring(j,j+i);
				Iterator key = map.keySet().iterator();
				if(key.hasNext()) {
					String tmp = key.next().toString();
					if(tmp.equals(sub))
					{ //동일 할 경우
						int value = map.get(tmp);
						value += 1;
						map.put(tmp, value);
					}
					else
					{
						//동일하지 않은 경우
						int value = map.get(tmp);
						if(value == 1)
							sb.append(tmp);
						else
							sb.append(value).append(tmp);
						map.remove(tmp); //해당 키 값 제거
						map.put(sub, 1); //다음 값 추가
					}
				}
				else
					map.put(sub, 1);
				
			}
			Iterator key = map.keySet().iterator();
			if(key.hasNext()) {
				String tmp = (String)key.next();
				int value = map.get(tmp);
				if(value == 1)
					sb.append(tmp);
				else
					sb.append(value).append(tmp);
			}
			String rest = s.substring(j,s.length());
			sb.append(rest);
			min = Math.min(min, sb.length()); //최솟값 비교
			map.clear(); 
		}
		System.out.println(min);
		return min;
    }
}

public class StringComp01 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		Solution01 func = new Solution01();
		func.solution(s);

	}
}